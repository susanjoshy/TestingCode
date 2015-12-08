package programlist;

import edu.whqa.basic.AccessModifier;

public class AccessModifierMain extends AccessModifier{
	public static void main(String[] args) {
		AccessModifierMain accmain=new AccessModifierMain();
		AccessModifier1 access=new AccessModifier1();
		//AccessModifier ac=new AccessModifier();
		System.out.println(access.getAge());//since age is private it can only accessible by getters
		
		
		System.out.println(access.name);// default in same package
		
		
		//System.out.println(ac.name);//defalut in another package
		
		System.out.println(access.salary); //protected in same package
		System.out.println(access.dept);//public in another class
		
		System.out.println(accmain.salary);//protected and in another package
		
		
	}

}
