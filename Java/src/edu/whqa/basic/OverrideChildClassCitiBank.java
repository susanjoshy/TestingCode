package edu.whqa.basic;

public class OverrideChildClassCitiBank extends OverrideParentClassBank{
	
	public OverrideChildClassCitiBank(){
		
		System.out.println(super.name);
		super.getRateOfInterest();
		System.out.println("Child constructor");
	}
	
	public int getRateOfInterest()
	{
		return 9;
	}

}
