package AdvancedJava;

public class WapperClass {

	public static void main(String[] args) {
		int i=10;
		//primitive to wrapper
		Integer l=new Integer(i);//creating all new object,bad practice
		//Integer w=Integer.valueOf(i);//best practice
		//Integer k=i;//autoboxing
		System.out.println(l+"$");
		System.out.println(l.toString()+"$");
		//wrapper to primitive
		Integer m=new Integer(3);
		int z=m.intValue();

		int d=m;//unboxing
		System.out.println(z);
		System.out.println(d);
		

	}

}
