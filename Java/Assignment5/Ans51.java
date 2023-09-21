class Demo{
	
	private String name;
	private int id;
	
	Demo(String n, int i){
		this.name = n;
		this.id = i;
	}
	
	void printData(){
		System.out.println("Your name is " + this.name);
		System.out.println("Your id is " + this.id);
	}
}

public class Ans51{
	public static void main(String[] args){
		Demo d1 = new Demo("Jackson", 420);
		d1.printData();
	}
}