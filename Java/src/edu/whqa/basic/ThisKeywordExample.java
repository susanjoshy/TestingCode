package edu.whqa.basic;

public class ThisKeywordExample {
	int id;
	String name;
public ThisKeywordExample()
{
	System.out.println("This keyword is "+this);
}

public ThisKeywordExample(int id)
{	this();
	System.out.println("This keyword is "+this);
}
ThisKeywordExample(int id,String name) //this is used to refer the current class 
{	this(id);
	this.id=id;
	this.name=name;
}
void display()
{	
	ThisExampleEmployee e1=new ThisExampleEmployee(this);
		e1.test(this);
	System.out.println("ID and Name is "+id +": "+name);
	
}
	public static void main(String[] args) {
		//ThisKeywordExample t=new ThisKeywordExample();
		//System.out.println("\nobject reference from this is "+t);
		ThisKeywordExample t1=new ThisKeywordExample(100,"susan");
		t1.display();
		System.out.println("\nobject reference is "+t1);
	}

}
