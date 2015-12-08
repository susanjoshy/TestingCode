package collections;

import java.util.ArrayList;

import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {
		
		StudentComparable s1=new StudentComparable(22,"susan");

		StudentComparable s2=new StudentComparable(12,"thomas");

		StudentComparable s3=new StudentComparable(34,"Aston");

		StudentComparable s4=new StudentComparable(17,"Maria");
		
		ArrayList<StudentComparable> list=new ArrayList<StudentComparable>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		
		for(StudentComparable sc:list){
			System.out.println(sc.age + "  "+sc.name);
		}
		Collections.sort(list);
		for(StudentComparable sc:list){
			System.out.println(sc.age + "  "+sc.name);
		}
		
	}

}
