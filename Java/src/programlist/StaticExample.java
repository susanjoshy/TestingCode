
/*Write a program that contains a constructor, a static block and a static method.

Execute the program in order to verify the order to execution of methods and block.

*/
package programlist;

public class StaticExample {
	int id;
	String name;
	static String dept="HR";
	static int count=0;
	public void print(){
		System.out.println("in non sttaic  method");
	}
	public StaticExample(){ //count is for class 
		count ++;
		System.out.println("Count is "+count);
	}
	static void test(int i)    //static method
	{
	i=10;
	System.out.println(i);
	System.out.println(count);//static method accessing the static variable
	}
	static                 //static block executes 1st
	{
		System.out.println("We are in sttaic block");
		
	}
		public static void main(String[] args) {
			new StaticExample();//constructor executes 2nd
			System.out.println(StaticExample.dept);
			StaticExample.test(30);//calling static method,executed 3rd
			StaticExample.test(20);
			StaticExample s1=new StaticExample();//constructor executes 4th
			s1.print();//
				
			
			

		}
	
	

}
