package edu.whqa.basic;

public class PrimeNumber {
	int number;
	PrimeNumber(int num)
	{
	number=	num;
	if (num%2==0)
		System.out.println("Not prime");
	else
		System.out.println(num +": is prime");
	}
	public static void main(String[] args) {
		new PrimeNumber(67);
		// TODO Auto-generated method stub

	}

}
