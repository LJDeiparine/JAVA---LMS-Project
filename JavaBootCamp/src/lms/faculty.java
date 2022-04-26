package lms;
import java.util.Scanner;

class Faculty extends Student{
	
	private String facultyName = "Professor X";
	private String[] students = {"Hanna", "KJ"};
	private String[] courses = {"Math", "Science", "History"};
	
	public void accessFacultyRecords() {
		
		Faculty faculty = new Faculty();
		
		System.out.println("-----Learning Management System Portal-----");
		System.out.println("");
		System.out.println("-----Faculty Personal Information-----");
		
		System.out.println("");
		System.out.println("Welcome " + faculty.facultyName);
		System.out.println("");
		System.out.println("Students: ");
		for(int i = 0; i < faculty.students.length; i++) {
			System.out.println("Student " + faculty.students[i]);
		}
		
		System.out.println("");
		System.out.println("Courses Handled: ");
		for(int i = 0; i < courses.length; i++) {
			System.out.println("Student " + faculty.courses[i]);
		}
		
		accessClassRecord();
		
	}
	
	public void accessClassRecord() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Student record to check? [1] Student 1 or [2] Student 2 or [0]Logout");
		int num = sc.nextInt();
		
		while(num == 1 | num == 2 | num == 0) {
			if(num == 1){
				accessStudentRecords1();
				studentRecords record = new studentRecords();
				record.setGwa(89.0);
				num = 0;
				accessClassRecord();
			}
			else if(num == 0) {
				System.out.println("Logging Out!");
				num = 0;
				
				Logout logout = new Logout();
				logout.doLogout();
				
			}
			else {
				accessStudentRecords2();
				studentRecords record = new studentRecords();
				record.setGwa2(80.0);
				num = 0;
				accessClassRecord();
			}
		}
	}
}
	