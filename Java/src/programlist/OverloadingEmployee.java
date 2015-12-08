package programlist;

import java.util.Scanner;

public class OverloadingEmployee {
	String name;
	int id;
	int age;
	static float salary=5000;
	  void setSalary(float salary){
		System.out.println("salary of the employee "+salary);
		
	}
	
	  float getSalary(){
			System.out.println("salary of the employee "+salary);
			return salary;
		}
	
	static void overloadEmployee(String name,int id,int age){
		System.out.println("overloaded method1 :"+name+" "+id+" "+age);
		
	}
	
	static void overloadEmployee(String name,float salary){
		System.out.println("overloaded method2 :"+name+" "+salary);
		
		
	}
	static void overloadEmployee(String name,int id,int age,float salary){
		System.out.println("overloaded method3 :"+name+" "+id+" "+age+" "+salary);
		
	}
	public static void main(String[] args) {
		OverloadingEmployee emp=new OverloadingEmployee();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String name=s.next();
		System.out.println("enter the age");
		int age=s.nextInt();
		System.out.println("enter the id");
		int id=s.nextInt();
		
		emp.setSalary(5000);
		s.close();
		overloadEmployee(name,id,age);
		overloadEmployee(name,5000);
		overloadEmployee(name,id,age,5000);
		
	}

}
