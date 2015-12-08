package programlist;

public class StringMethods {
	public static void main(String[] args) {
		String s1="susan";
		String s2="thomas";
		System.out.println("address of string "+s1.hashCode());
		System.out.println("Addr of 2nd string "+s2.hashCode());
		if(s1.equals(s2)){
			System.out.println("2 strings are equal");
		}
		else
			System.out.println("not equal");
	}

}
