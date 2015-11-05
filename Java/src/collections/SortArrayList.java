package collections;

import java.util.ArrayList;
//import java.util.Collections;

public class SortArrayList {
	static ArrayList<Integer> sortedList(ArrayList<Integer> list){
		//Collections.sort(list);
		for (int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i)>list.get(j)){
					int temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
					
				}
			}
		}
		return list;
	}


	public static void main(String[] args) {
	ArrayList<Integer> alist=new ArrayList<Integer>();
	alist.add(23);
	alist.add(90);
	alist.add(45);
	alist.add(67);
	alist.add(11);
	alist.add(52);
	System.out.println("sizi is"+alist.size());
	System.out.println("before sort");
	for(Integer i:alist){
		System.out.println(i);
	}
	System.out.println("after sort");
	SortArrayList.sortedList(alist);
	for(Integer i:alist){
		System.out.println(i);
	}

}
}