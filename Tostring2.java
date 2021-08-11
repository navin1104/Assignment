package com.techment.test.day8;
class Employee
{
	String firstname;
	String lastname;
	public Employee(String firstname, String lastname) 
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Employee firstname=" + firstname + ", lastname=" + lastname  ;
	}
	
	
}

public class Tostring2 {

	public static void main(String[] args) {
		Employee e1  = new Employee("Avinash " , "Chouhan");
		Employee e2  = new Employee("Agnivesh " , "Chouhan");
		System.out.println(e1);
		System.out.println(e2);
	}

}
