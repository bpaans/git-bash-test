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
		System.out.println("Hello display");
	}
}
