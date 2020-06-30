package emailapplication;

import java.util.Scanner;

public class Email {
private String firstName;
private String lastName;
private String password;
private int defaultLength = 8;
private String department;
private String email;
private int mailboxCap = 500;
private String alternateEmail;
private String companySuffix = "company.com";

//constructor for first and last name
public Email (String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	
	//Call method for department
	this.department = setDepartment();
	
	//Combine elements to generate email
	email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	
	//Call a method that returns a random password
	this.password = randomPassword(defaultLength);
	System.out.println("Your generated password is: " + this.password);
	}




//ask for department
private String setDepartment() {
	System.out.println("New worker: " + firstName + " " + lastName + "\nEnter the department\n1 for Development\n2 for Sales\n3 for Accounting\n0 for none\nEnter department code: ");
	Scanner in = new Scanner(System.in);
	int depChoice = in.nextInt();
	if (depChoice == 1) {
		return "development";
	}
	else if (depChoice == 2) {
		return "sales";
	}
	else if (depChoice == 3) {
		return "accounting";
	}
	else {
		return "";
	}	
}

//generate a random password
private String randomPassword(int length) {
	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
	char [] password = new char[length];
	for (int i =0; i < length; i++) {
		 int rand = (int) (Math.random() * passwordSet.length());
		 password[i] = passwordSet.charAt(rand);
	}
	return new String(password);

//
}

//set alternate email
public void setAlternateEmail(String altEmail) {
	this.alternateEmail = altEmail;
}
//set mailbox capacity
public void setMailboxCapacity(int capacity) {
	this.mailboxCap = capacity;
}
//change password
public void changePassword(String password) {
	this.password = password;
}
//get methods
public String getAlternateEmail() {
	return alternateEmail;
}
public int getMailboxCapacity() {
	return mailboxCap;
}
public String getPassword() {
	return password;
}

//method to show all of the user's info
public String showInfo() {
	return "Display Name: " + firstName + " " + lastName +
			"\nCompany Email: " + email +
			"\nMailbox Capacity: " + mailboxCap + "mb";
}

}
