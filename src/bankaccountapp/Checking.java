package bankaccountapp;

public class Checking extends Account {
	//List properties specific to checking account
	private int debitCardNumber, debitCardPIN;
	//Constructor to initialize properties
	public  Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;
		setDebitCard();
		
	}
	//List any methods specific to the checking account
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10,12));
		debitCardPIN = (int) (Math.random() * Math.pow(10,4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features" +
				"\n Debit Card Number: " + debitCardNumber +
				"\n Debit Card PIN: " + debitCardPIN);
	}
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate = getBaseRate() * .15;
	}
}
