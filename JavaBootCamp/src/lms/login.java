package lms;

import java.util.Scanner;

class Login{
	 
	public void doLogin() {
		
		String student1 = "student1@ue.edu.ph";
		String pass1 = "passStudent1";
		
		String student2 = "student2@ue.edu.ph";
		String pass2 = "passStudent2";
		
		String faculty1 = "faculty@ue.edu.ph";
		String pass3 = "facultyPass123"; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Learning Management System Portal-----");
		System.out.println("");
		System.out.println("-----Log In Form-----");
		
		System.out.print("Enter your e-mail: ");
		String email = sc.next();
		System.out.println("");
		System.out.print("Enter your password: ");
		String pass = sc.next();
		System.out.println("");
		System.out.println("Logging In!");
		System.out.println("");
		
		if(student1.equals(email) & pass1.equals(pass)) {
			Student student = new Student();
			student.accessStudentRecords1();
		}
		else if(student2.equals(email) & pass2.equals(pass)) {
			Student student = new Student();
			student.accessStudentRecords2();
		}
		else if (faculty1.equals(email) & pass3.equals(pass)) {
			Faculty faculty = new Faculty();
			faculty.accessFacultyRecords();
		}
		else {
			System.out.println("Invalid Login!");
			System.out.println("");
			System.out.println("");
			doLogin();
		}
		
	}			
}
