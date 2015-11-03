package edu.whqa.basic;
public class ChildInheritance extends ParentInheritance{
	

	


	public ChildInheritance(int id, String name, AggregationAddress addr) {
		super(id, name, addr);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){
		AggregationAddress a1=new AggregationAddress("SAn Jose" ,"CA");
		ChildInheritance c=new ChildInheritance(20,"Maria",a1);
		c.calculateSalary();
	   c.display();
		
	}

}
