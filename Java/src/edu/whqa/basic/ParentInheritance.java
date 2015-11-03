package edu.whqa.basic;

public class ParentInheritance {
	int id;
	String name;
	AggregationAddress addr;
	//double salary;
	public ParentInheritance(int id,String name,AggregationAddress addr)
	{
		this.id=id;
		this.name=name;
		this.addr=addr;
		
	}
	public void display()
	{
		
		System.out.println("Emp details are "+"id is "+id+" Name is "+name+ "  Address is :"+addr.city+addr.state);
	}
 public void calculateSalary(){
		System.out.println("Inherting from parent");
	}
 public static void main(String args[]){
	 System.out.println("From main");
	 AggregationAddress aa=new AggregationAddress("San jose","CA");
	 ParentInheritance pi=new ParentInheritance(10,"susan",aa);
	 pi.display();
	 
}


}
