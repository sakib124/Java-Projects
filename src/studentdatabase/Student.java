package studentdatabase;

import java.util.Scanner;

public class Student {
	private String firstname, lastname, courses = "", studentID;
	private int gradeLevel, tuitionBalance = 0;
	private static int costOfCourse = 600, id = 1000;
	//Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student's first name: ");
		this.firstname = in.nextLine();
		
		System.out.print("Enter student's last name: ");
		this.lastname = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeLevel = in.nextInt();
		
		setStudentID();
		
	}
	//Generate ID
	private void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID = gradeLevel+ "" + id;
	} 
	//Enroll in courses
	public void enroll() {
		//get inside loop
		do {
		System.out.print("Enter course to enroll (Press q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("q")) {
			courses = courses + "\n " + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else { break; }
		} 
		while (1 == 1);
	}
	//View Balance
	private void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	} 
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	//Show Status
	public void showInfo() {
		System.out.println("Display Name: " + firstname + " " + lastname +
				"\nGrade Level: " + gradeLevel +
				"\nStudent ID: " + studentID +
				"\nEnrolled in: " + courses +
				"\nBalance: $" + tuitionBalance); 
	}
	
}
