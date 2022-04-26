package secondSession;
import java.util.*;

public class AssignmentOne {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		//Getting the Name
	    System.out.println("Hello. What is your name?");
	    String name = myObj.nextLine();  // Getting the name
	    System.out.print("\n");
	    
	   
	    System.out.println("Hi " + name +"! I'm Javabot. Where are you from?");  //Output of Name
	    String place = myObj.nextLine(); //Getting the place
	    System.out.print("\n");
	    
	    System.out.println("I hear it's beautiful at "+ place + "! I'm from a place called Oracle.");    //Output of place
	    System.out.println("How old are you?"); 
	    String age = myObj.nextLine();  // Getting the Age
	    System.out.print("\n");
	    
	
	    System.out.println("So you're "+ age + ", cool I'm 400 years old.");   //Output of age
	    System.out.println("Enough about me. What's your favorite language? (just don't say Python)"); 
	    String language = myObj.nextLine();  // Getting language
	    System.out.print("\n");
	    
	    System.out.println(language+ ", that's great! Nice chatting with you " + name + " . I have to log off now. See ya!");  //Output of language
	 
	    myObj.close();
	}

}
