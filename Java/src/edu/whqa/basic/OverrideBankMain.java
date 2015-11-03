package edu.whqa.basic;

public class OverrideBankMain {
	
	public static void main(String[] args) {
	/*	OverrideChildClassCitiBank citi=new OverrideChildClassCitiBank();
		System.out.println("Rate of interst is "+citi.getRateOfInterest());
		OverrideChildClassChaseBank chase=new OverrideChildClassChaseBank();
		System.out.println("Rate of interst is "+chase.getRateOfInterest());*/
		OverrideParentClassBank b1=new OverrideParentClassBank();
		System.out.println("Normal rate from Bank is "+b1.getRateOfInterest());
		OverrideParentClassBank b=new OverrideChildClassCitiBank();
		int rate=b.getRateOfInterest(); 
		System.out.println("Rate is "+rate);
		// TODO Auto-generated method stub

	}

}
