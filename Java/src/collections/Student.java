package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	String name;
	int id;
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}
public static void main(String[] args) {
	Student s1=new Student(10,"susan");
	Student s2=new Student(20,"Maria");
	Student s3=new Student(30,"Aston");
	Student s4=new Student(40,"Thomas");
	Student s5=new Student(10,"susan");
	ArrayList<Student> list=new ArrayList<Student>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);
	
	for(Student s:list){
		System.out.println("id is "+s.id);
		System.out.println("name is "+s.name);
	}
	Iterator<Student> it=list.iterator();
	System.out.println("From Iterator");
	while(it.hasNext()){
		Student s=it.next();
		System.out.println(s.id+s.name);
	}
}
}
