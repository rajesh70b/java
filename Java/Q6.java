import java.util.Scanner;

public class Q6{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1st number for Swap: ");
		int num1 = in.nextInt();
		
		System.out.println("Enter 2nd number for Swap: ");
		int num2 = in.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);
		Syatem.out.println("\n");
		
		int temp;
		
		temp = num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After Swapping");
		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);
		
	}
}