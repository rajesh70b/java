public class Ans36{
	public static void main(String[] args){
		
		int intArr[] = {3,9,7,1,5};
		
		float floatArr[] = {1.8f,4.5f,5.4f,2.6f,3.2f};
		
		for(int i = 0; i < intArr.length; i++){
			
		System.out.print("\nElement of intArr["+i+"]: " + intArr[i]);
		System.out.println("\t Doubling value: " + intArr[i]*2);
	
		System.out.print("Element of floatArr["+i+"]: " + floatArr[i]);
		System.out.println("\t Doubling value: " + floatArr[i]*2);
		
		}
	
	}	
}