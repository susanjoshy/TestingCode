package edu.whqa.basic;

public class Constructor {
	int id,age;
	String name;
	Constructor(int i,String s)
	{
		 id=i;;
		 name=s;
	}
	Constructor(int i,String s,int a)
	{
		id=i;
		name=s;
		age=a;
		System.out.println("Printing from Constructor The info is : "+id + name+ age);
	}


public static void main(String args[]){
	Constructor c=new Constructor(10,"susan");
	System.out.println("id and name is  "+c.id+c.name);
	
	Constructor c1=new Constructor(10,"susan",50);
	System.out.println("id name and age is  "+c1.id+" :" +c1.name +c1.age);
	
		
}
}