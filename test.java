package hardiii;
import java.util.Scanner;
public class New {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Test");
		System.out.println("Question1: What is 2+2 in letters?");
		String ans1 = scan.next();
		
		while(!ans1.equals("four"))
		{
			System.out.println("You had the wrong answer!! What is 2+2 in letters");
			ans1 = scan.next();
			
		}
		System.out.println("Great your answer was right");
	    System.out.println("Question2: Where is Toronto?");
	    
	    String ans2 = scan.next();
	    
	    
	    while(!ans2.equals("Canada")) {
	    	System.out.println("You had the wrong answer!! Try again");
	    	ans2 = scan.next();
	    	
	    }
	    System.out.println("Great you passed the test");
	}
	
}
