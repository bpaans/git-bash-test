package jUnit;

public class Employee {
	private String name;
	private double salPerMonth;
	
	Employee(String name, double salPerMonth){
		this.name = name;
		this.salPerMonth = salPerMonth;
	}
	
	public String helloName(String inputName){
		return "Hello " + inputName;
	}
	
	public double yearlySalary(double monthlySalary){
		return 12*monthlySalary;
	}
	public void display(){
		System.out.println("Hello display 123");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalPerMonth() {
		return salPerMonth;
	}

	public void setSalPerMonth(double salPerMonth) {
		this.salPerMonth = salPerMonth;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salPerMonth=" + salPerMonth + "]";
	}
	
	
}
