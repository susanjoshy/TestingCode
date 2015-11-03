package edu.whqa.basic;

public class RecusionFactorial {
	
	
	public int recur(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else
		return num*recur(num-1);
	}

	public static void main(String[] args) {
		RecusionFactorial f= new RecusionFactorial();
		int value=f.recur(7);
		System.out.println("Factorial i s :"+value);

	}

}
