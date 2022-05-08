package hardiii;
import java.util.Scanner;
public class New {
	public static void main(String[] args)
	{
		System.out.println("How many courses you had this semester");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		double[] noofcourse= new double[x];
		double sum = 0;
		
		for(int i = 0  ;  i < noofcourse.length ; i++)
		{
			System.out.println("Enter your average for the course" + (i+1)+":");
			noofcourse[i]=scan.nextDouble();
			}
		for(int i=0; i < noofcourse.length; i++)
			{
			sum= sum+ noofcourse[i];
			
			}
		double average = sum/noofcourse.length;
		
		if (average>90) {
			System.out.println("You have A");
			
		}
		else if(90>=average && average>80)
		{
			System.out.println("You have B");
			
		}
		else if(80>=average && average>70)
		{
			System.out.println("You have C");
			
		}
		else if(70>=average && average>60)
		{
			System.out.println("You have D");
		}
		else if(average<60)
		{
			System.out.println("You have failed");
		}
		else {
			
			System.out.println("Please try again");
		}
	}
		}
	
