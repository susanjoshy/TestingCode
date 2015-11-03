package edu.whqa.basic;

public class Employee {
	int  employeeId;
	String employeeName;
	double salary;
	static String dept;
	public void showEmployee(int id,String name,double salary){
		System.out.println("Emplyoee details :  \n"+"id is: "+id+"\nName is :"+name+"\nsalry is  :"+salary+"\nDepartment is :"+dept);
		
		
	}
	public double getSalary(){
		return salary;
		
	}
	public void hikeSalary(int pct){
		salary=salary+(salary*pct*0.01);
		
	}
	
	
	
	

}
