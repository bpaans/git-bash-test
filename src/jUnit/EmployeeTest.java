package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {
	
	Employee employee = new Employee("Bharat", 5000);
	
	@Test
	public void testHelloName() {
		assertEquals("Hello Bharat", employee.helloName("Bharat"));
	}
	
	@Test
	public void testYearlySalary(){
		assertEquals(60002, employee.yearlySalary(5000), 3);
		// assertEquals(double expected, double actual, double delta)
		// delta - margin (+-3)
	}

}
