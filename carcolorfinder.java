package hardiii;
public class New {
	public static void main(String[] args)
	{
		String[] Data = new String[5];
		Data[0]="Blue";
		Data[1]="Green";
		Data[2]="red";
		Data[3]="Blue";
		Data[4]="Blue";
		
		for(int i=0;i<Data.length;i++){
			if(Data[i].equals("Blue"))
		{
			System.out.println("Car number " +i+ " is blue");
			

		}

		else
			{
			System.out.println("Car number "+i+" is not blue");
			}
			}
	
}}
