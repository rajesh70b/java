class Employee{
	
	String name;
	int paymentPerHour;
	
	Employee(String nm, int pph){
		this.name = nm;
		this.paymentPerHour = pph;
	}
}

class ContractorEmp extends Employee{
	
	int workingHours;
	
	ContractorEmp(int wh){
		this.workingHours = wh;
	}
	
	int calculateSalary(){
		return workingHours * paymentPerHour;
	}
}

class FullTimeEmp extends Employee{
	
	int workingHours;
	
	FullTimeEmp(int wh){
		this.workingHours = wh;
	}
	
	int calculateSalary(){
		return workingHours * paymentPerHour;
	}
}

public class Ans54{
	public static void main(String[] args){
		Employee e1 = new Employee("Dhwanit", 100);
		
		ContractorEmp e2 = new ContractorEmp(8);
		
		FullTimeEmp e3 = new FullTimeEmp(12);
		
		System.out.println(e2.calculateSalary());
		System.out.println(e3.calculateSalary());
	}
}