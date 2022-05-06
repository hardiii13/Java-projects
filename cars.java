package hardiii;
import java.util.Scanner;
public class New {
	public static void main(String[] args)
	{
		System.out.println("Do you want a car");
		Scanner scan = new Scanner (System.in);
		String ans1 = scan.next();
		
		if(ans1.equals("yes")) {
			System.out.println("Whta is your favouriate colour between red and blue");
			String ans2 = scan.next();
			
			if(ans2.equals("red")) {
				System.out.println("We have it in stock would you like to see it or not");
				String ans3 = scan.next();
				
				if(ans3.equals("yes")){
						System.out.println("Great! lets check the car");}
			else {
				System.out.println("No worries we wil check something else");}
			}
			else if(ans2.equals("blue")){
			     System.out.println("We can order it");
			}
			else
			{
				System.out.println("We dont have it in stock");
			}
		}
		else
			{
			System.out.println("No worries have a good day");
			}
			}
		

}
