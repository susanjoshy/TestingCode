package collections;

public class StudentComparable implements Comparable{
	int age;
	String name;
	public StudentComparable(int age,String name){
		this.age=age;
		this.name=name;
		
	}
	public int compareTo(Object o){
		StudentComparable s=(StudentComparable) o;
		if(age==s.age)
			return 0;
		
		else if(age<s.age)
			return 1;
		else
		return 1;
	}
	

}
