import java.util.Scanner;

	public class IT24101252Lab5Q1{
	
	public static void main(String[] args){
		
		int num1,num2,num3,min,max;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first integer : ");
		num1=sc.nextInt();
		
		System.out.println(" ");
		
		System.out.print("Enter the second integer : ");
		num2=sc.nextInt();
		
		System.out.println(" ");
		
		System.out.println("Enter the third integer : ");
		num3=sc.nextInt();
		
		System.out.println(" ");
		
		System.out.println("User entered numbers are : "+num1+" "+num2+" "+num3);
		
		if(num1<num2 && num1<num3){		
			min=num1;
		}
		if(num2<num1 && num2<num3){		
			min=num2;
		}
		else{
			min=num3;
		}
		if(num1>num2 && num1>num3){		
			max=num1;
		}
		if(num2>num1 && num2>num3){		
			max=num2;
		}
		else{
			max=num3;
		}
		
		System.out.println("The smallest Number is : "+min);
		
		System.out.print("The Largest Number is : "+max);
	}
}
		