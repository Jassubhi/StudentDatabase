package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how many student we want to add 
		System.out.println("Enter number of student to enroll:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Student[] students = new Student[num];
		//create n number of students
		
		for(int i = 0; i < num; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].toString());
		}
		
	}

}
