package edu.whqa.basic;

public class testEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.employeeId=101;
		e1.employeeName="susan";
		e1.salary=1000;
		Employee.dept="HR";
		e1.hikeSalary(10);
		System.out.println("Salary is  :"+e1.getSalary());
		e1.showEmployee(101,"susan",1000);
		Employee e2=new Employee();
		e2.employeeId=102;
		e2.employeeName="Maria";
		e2.salary=2000;
		Employee.dept="HR";
		e2.hikeSalary(15);
		System.out.println("Salary of 2nd Employee is   :"+e2.getSalary());
		e2.showEmployee(102,"Maria",2000);
		

	}

}
