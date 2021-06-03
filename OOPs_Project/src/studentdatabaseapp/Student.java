package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeyear;
	private String studentID;
	private  String courses = null;
	private int tuition_balance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//Constructor: prompt user to enter student name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name:");
		this.firstName = in.nextLine();
		System.out.println("Enter student last name:");
		this.lastName = in.nextLine();
		System.out.println("1.Freshman \n2.Sophmore \n3.Junior \n4.Senior\nEnter the student class level:");
		this.gradeyear = in.nextInt();
		setStudentID();
		
	}
	
	//Generate an id
	private void setStudentID() {
		id++;
		this.studentID = gradeyear + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter the course to enroll(Q to quit):");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses+"\n"+ course;
				tuition_balance = tuition_balance + costOfCourse;
			}
			else {
				break;
			}
		}while(1 != 0);
		
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is : $" + tuition_balance);
	}
	
	//Pay tuition
	
	public void payTuition() {
		viewBalance();
		Scanner in =  new Scanner(System.in);
		System.out.print("Enter the payment: $");
		int payment = in.nextInt();
		tuition_balance = tuition_balance - payment;
		System.out.println("Thank You for your payment of $" + payment);
		viewBalance();
	}
	
	//Show status
	
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeyear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses + "\nBalance: $" + tuition_balance;  
	}
}
