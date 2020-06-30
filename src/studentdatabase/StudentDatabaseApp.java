package studentdatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ask how many students to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student [] students = new Student[numOfStudents];
		
		//create n number of students
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		
		//print info for each student after filling the input fields
		for (int n = 0; n < numOfStudents; n++) {
			students[n].showInfo();
		}
	}
}
