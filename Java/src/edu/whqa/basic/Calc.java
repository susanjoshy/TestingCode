package edu.whqa.basic;

public class Calc {
	
	int firstNum=10;   //class/instance variable
	
	public int sum(int firstNum,int secNum)
	{
		
		
		System.out.println("local vraible in function is  : "+firstNum);
		int sum=firstNum+secNum;
		System.out.println(sum);
		return sum;
	
	}
	public int subtract()
	{
		int firstNum=34,secNum=21;
		System.out.println("local variable is: "+secNum);
		int dif=firstNum-secNum;
		System.out.println(dif);
		return dif;
		
	}
	public float sum(float firstNum,float secNum)
	{
		
		//float firstNum=23.567456546556f;
		//float secNum=30.234567766787687f;
		System.out.println("local vraible in function is  : "+firstNum);
		float sum=firstNum+secNum;
		System.out.println(sum);
		return sum;
	
	}
	public double sumDouble()
	{
		
		double firstNum=23.567456546556;
		double secNum=30.234567766787687;
		System.out.println("local vraible in function is  : "+firstNum);
		double sum=firstNum+secNum;
		System.out.println(sum);
		return sum;
	
	}
	public static void main(int n)
	{
		System.out.println("value from main () overlaoded  :"+n);
	}
	
	public static void main(String args[])
	{
		Calc obj=new Calc();
		
		System.out.println("The instance(class) variable is:  "+obj.firstNum);
		System.out.println("Sum is :"+obj.sum(21,12));
		System.out.println("Difference is :"+obj.subtract());
		System.out.println("sumFloat is :"+obj.sum(23.56745654655630f,234567766787687f));
		System.out.println("sumDouble is   :"+obj.sumDouble());
	main(7);
	
}
}