package FourPillars;


import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Learning Management System Portal");
		System.out.println(" ");
		
		
		System.out.println("Enter the number that corresponds to your status");
		System.out.println("[1] for Faculty");
		System.out.println("[2] for Student");
		System.out.print("Enter the type of user: ");
		int user = sc.nextInt();
		System.out.println("");
		
		
		System.out.print("Enter your e-mail: ");
		String email = sc.next();
		System.out.println("");
		System.out.print("Enter your password: ");
		String pass = sc.next();
		System.out.println("");
		System.out.println("");
		
		
		if(user == 1) {
			Login login = new Faculty();
			login.getCredentials();
			Records obj = new Records ();
		    obj.setStudentsHandled(10);
		    System.out.println("Number Of courses handled: "+ obj.getStudentsHandled() + " classes.");
		    obj.setStudents(150);
		    System.out.println("Number Of students handled: "+ obj.getStudents() + " students.");
		}
		else {
			Login login = new Student();
			login.getCredentials();
			studentRecords obj = new studentRecords ();
		    obj.setGwa(1.46);
		    System.out.println("Your recent GWA: "+ obj.getGwa());
		}
		
		sc.close();

	}

}
