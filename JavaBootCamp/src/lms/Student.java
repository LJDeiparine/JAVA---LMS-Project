package lms;

import java.util.Scanner;

class Student{
	public void accessStudentRecords1() {
		
		String[] courses = {"Math", "Science", "History"};
		int[] grades = {91, 85, 91};
		
		System.out.println("-----Learning Management System Portal-----");
		System.out.println("");
		System.out.println("-----Student Personal Information-----");
		
		System.out.println("Student Name: Hanna Mae Ignacio");
		System.out.println("");
		System.out.println("These are your records/grades: ");
		for(int i = 0; i < grades.length; i++) {
			System.out.println(courses[i] + ": " + grades[i]);
		}
		
		studentRecords records = new studentRecords();
		records.setGwa(89.0);
		System.out.print("GWA: " + records.getGwa());
		
		int number = 1;
		accessLogout(number);
		
	}

	public void accessStudentRecords2() {
		String[] courses = {"Math", "Science", "History"};
		int[] grades = {85, 75, 80};
		System.out.println("Student Name: Kristian Jerome A. Billones");
		System.out.println("");
		System.out.println("These are your records/grades: ");
		for(int i = 0; i < grades.length; i++) {
			System.out.println(courses[i] + ": " + grades[i]);
		}
		
		studentRecords records = new studentRecords();
		records.setGwa2(80.0);
		System.out.print("GWA: " + records.getGwa2());	
		
		int number = 1;
		accessLogout(number);
	}
	
	public void accessLogout(int number) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("Do you want to log out? [Y] Yes or [N] No ");
		String option = sc.next();
		
		if(option.equalsIgnoreCase("Y")) {
			Logout logout = new Logout();
			logout.doLogout();
		}
		else if (number == 1) {
			accessStudentRecords1();
		}
		else {
			accessStudentRecords2();
		}
	}
	
}