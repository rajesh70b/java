import java.util.Scanner;

public class Ans37{
	
	public static void sumArr(int arr[]){
		System.out.println(arr);
	}
	
	public static void main(String[] a){

		Scanner in = new Scanner(System.in);
		
		int arr[];
		
		int i = 0;	
		while(i < 5){
			System.out.print("Enter element for arr["+i+"]: ");
			int ele = in.nextInt();
			arr[] = ele;
		}
		
		sumArr(arr);
		
	}

}