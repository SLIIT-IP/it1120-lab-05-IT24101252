import java.util.Scanner;

	public class IT24101252Lab5Q3{
	
	public static void main(String[] args){
	
		final int DATE1,DATE2,RDAY;
		final double CHARGE,TOTAL,DISCOUNT;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter start date (1-31) : ");
		DATE1=sc.nextInt();
		
		System.out.print("Enter End date (1-31) : ");
		DATE2=sc.nextInt();

		if(DATE2>31 || DATE2<1){
			System.out.print("Error: Days must be between 1 and 31");
			System.exit(0);
		}
		if(DATE1>31 || DATE1<1){
			System.out.print("Error:  Days must be between 1 and 31");
			System.exit(0);
		}
		if(DATE2<DATE1){
			System.out.print("Error: Start Date must be less than end date");
			System.exit(0);
		}
		System.out.println(" ");
		CHARGE=48000.0;
		System.out.println("Room Charge per Day: "+CHARGE+"/=");
		
		RDAY=DATE2-DATE1;
		System.out.println("Number of days reserved :  "+RDAY);
		
		switch(RDAY)
			{
				case 1:TOTAL=CHARGE;
				break;
				case 2:TOTAL=CHARGE*2.0;
				break;
				case 3:DISCOUNT=(CHARGE*3)*10.0/100.0;
				TOTAL=CHARGE*3.0-DISCOUNT;	
				break;
				case 4:DISCOUNT=(CHARGE*4)*10.0/100.0;
				TOTAL=CHARGE*4.0-DISCOUNT;
				break;
				default:DISCOUNT=(CHARGE*RDAY)*20.0/100.0;
				TOTAL=CHARGE*RDAY-DISCOUNT;
			}	
		
		System.out.println("Total amount to be paid : " + TOTAL);
	}
}