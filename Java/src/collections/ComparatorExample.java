package collections;

import java.util.Comparator;

public class ComparatorExample implements Comparator {
	public int compare(Object o1,Object o2){
		StudentComparable s1=(StudentComparable) o1;
				StudentComparable s2=(StudentComparable) o2;
		if(s1.age==s2.age)
			return 0;
		
		else if(s1.age<=s2.age)
			return -1;
		else
		return 1;
	}
	}


