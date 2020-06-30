package bankaccountapp;

public class Savings extends Account{

	
	//List properties specific to savings account
	private int safetyDepositBoxID, safetyDepositBoxKey;
	//Constructor to initialize properties
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "2" + accountNumber;
		setSafetyDepositBox();
	}
	
	//List any methods specific to the savings account
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Savings Account Features" +
				"\n Safety Deposit Box ID: " + safetyDepositBoxID +
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey);
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate = getBaseRate() - .25;
	}
	}

