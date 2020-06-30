package bankaccountapp;

public abstract class Account implements IBaseRate {
	//List common properties for both checking and savings
	private String name, ssn;
	protected String accountNumber;
	protected double rate;
	static int index = 10000;
	protected double balance;
	
	//Constructor to set the base and initialize account
	public  Account(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
		//Set account number
		index++;
		 setAccountNumber();
		 setRate(); 
	}
	
	//List common methods
	public abstract void setRate();
	
	private void setAccountNumber() {
		String lastTwoSSN = ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10,3));
		this.accountNumber = lastTwoSSN + uniqueID + randomNumber;
}
	public void compound() {
		double accruedInterest = balance * (rate/100);
		System.out.println(name + "'s account:");
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + String.format("%.2f", accruedInterest));
		printBalance();
	}
	public void deposit(double amount) {
		System.out.println(name + "'s account:");
		balance = balance + amount;
		System.out.println("Depositing $" + String.format("%.2f", amount));
		printBalance();
	}
	public void withdraw(double amount) {
		System.out.println(name + "'s account:");
		balance = balance - amount;
		System.out.println("Withdrawing $" + String.format("%.2f", amount));
		printBalance();
	}
	public void  transfer(String location, double amount) {
		System.out.println(name + "'s account:");
		balance = balance - amount;
		System.out.println("Transfering $" + String.format("%.2f", amount) + " to " + location);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your balance is now $" + String.format("%.2f", balance));
	}
	public void showInfo() {
		System.out.println("Name: " + name +
				"\nAccount Number: " + accountNumber +
				"\nBalance: $" + String.format("%.2f", balance) +
				"\nRate:" + rate + "%");
	}
	
}
