package AdvancedJava;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		System.out.println("Enter last name");
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		System.out.println("the entered valus is"+str);
		s.close();

	}

}
