public class Ans35{
	public static void main(String[] args){
		
		int intArr[] = {18,40,54,26,32};
		int sumArr = 0;
		int i;
		
		for(i = 0; i < intArr.length; i++){
			sumArr = sumArr + intArr[i];
		}
		
		System.out.println("SUM of Array's elements: " + sumArr);
		
		float arrAverage = sumArr / intArr.length;
		
		System.out.println("AVERAGE of Array's elements: " + arrAverage);
		
	}
}