package edu.whqa.basic;

public class Factorial {
	
	public int  fact(int number)
	{
		int fact1=number;
		for(int i=1;i<number;i++)
		{
			fact1=fact1*i;
	}
 return fact1;
}
	
public static void main(String[] args)
{
	Factorial f= new Factorial();
	int value=f.fact(4);
	System.out.println("Factorial i s :"+value);
	
}
}