import java.util.Scanner;

	public class IT24101252Lab5Q2{
	
	public static void main(String[] args){
		
		int members;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of members introduced :");
		members=sc.nextInt();
		
		if(members>=0)
		{	
			switch(members)
			{
				case 0:System.out.print("No prize");
				break;
				case 1:System.out.print("Pen");
				break;
				case 2:System.out.print("Umbrella");
				break;
				case 3:System.out.print("Bag");
				break;
				case 4:System.out.print("Travelling Chair");
				break;
				default:System.out.print("Headphone");
			}
		}
		else
		{
		System.out.print("Input must be a number 0 or grater");	
		}
	}
}