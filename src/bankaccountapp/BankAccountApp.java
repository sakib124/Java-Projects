package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		//Read a CSV file and create new accounts based on the data
		String file ="src\\utilities\\accounts";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name =  accountHolder[0];
			String ssn =  accountHolder[1];
			String accountType =  accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, ssn, initDeposit));
			}
			else if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, ssn, initDeposit));
			}
			else  {
				System.out.println("Could not find account type");
			}
		}
		
		for (Account acc: accounts) {
			System.out.println("\n*********************************");
			acc.showInfo();
		}
	
		System.out.println("\n*********************************");
		
//		accounts.get(5).deposit(200);
//		accounts.get(5).compound();
//		accounts.get(5).transfer("Brokerage", 500);
//		accounts.get((int) (Math.random() * accounts.size())).withdraw(150);	
	}
}
