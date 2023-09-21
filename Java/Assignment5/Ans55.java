class GrandFather{
	String house = "4BHK Duplex"; 
}

class Father extends GrandFather{
	String company = "3000sqft Area";
}

class Child extends Father{
	String car = "Jeep Compass";
}

class GrandChild extends Child{}

public class Ans55{
	public static void main(String[] args){
		
		GrandChild son1 = new GrandChild();
		
		System.out.println(son1.house);
		System.out.println(son1.company);
		System.out.println(son1.car);
	}
}