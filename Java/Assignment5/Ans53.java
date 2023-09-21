class Demo3{
	Demo3(int n1, int n2){
		System.out.println(n1 +" + "+ n2 +" = "+ (n1 + n2));
	}
	
	Demo3(int n1, int n2, int n3){
		System.out.println(n1+ " + " +n2+ " + " +n3+ " = " +(n1+n2+n3));
	}
}

public class Ans53{
	public static void main(String[] args){
		Demo3 d1 = new Demo3(5, 8);
		Demo3 d2 = new Demo3(5, 3, 8);
	}
}