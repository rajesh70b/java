class SuperClass{
	long PRN;
	String name;
	String collageName = "MSU Baroda";
	
	SuperClass(long id, String nm){
		this.PRN = id;
		this.name = nm;
	}
}

class SubClass extends SuperClass{
	super(8023033350, "Dhwanit Panchal"); // constructor of ParentClass
	
}

public class Ans56{
	public static void main(String[] args){
		
	}
}