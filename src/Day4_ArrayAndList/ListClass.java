package Day4_ArrayAndList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListClass {
	
	public static void main(String[] args) {
		// interfacenName variableName = New Class Name
		
		List<Integer> li = new LinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		
		System.out.println(li);
		
		// to find the size of the arraylist
		int a = li.size();
		System.out.println(a);
		
		// to add some value in the last index  
		li.add(100);
		System.out.println(li);
		
		// to add the value in the particular position
		li.add(2, 200);
		System.out.println(li);
		
		// to replace the value by using index
		li.set(2, 300);
		System.out.println(li);
		
		// to removed the particular value by using index
		li.remove(3);
		System.out.println(li);
		
		
		li.add(40);
		System.out.println(li);
		
		// to find the index position of the value
		int b = li.indexOf(40);
		System.out.println(b);
		
		// to find the Last index position of the value
		int c = li.lastIndexOf(40);
		System.out.println(c);
		
		// to get the particular value by using index
		Integer d = li.get(0);
		System.out.println(d);
		
		
		// to clear all the values
//		li.clear();
//		System.out.println(li);
		
		// to check whether the list is empty or not
		boolean e = li.isEmpty();
		System.out.println(e);
		
		// to check whether the particular value is p[resent or not
		boolean f = li.contains(20);
		System.out.println(f);
		
		List<Integer> li1 = new ArrayList();
		li1.add(500);
		li1.add(300);
		System.out.println(li1);
		
		// to merge lists
		li.addAll(li1);
		System.out.println(li);
		
		
		// to removed the common value in the list
		
//		li.removeAll(li1);
//		System.out.println(li);
		
		// to retain the common value
//		li.retainAll(li1);
//		System.out.println(li);
		
		
		
		
		// for loop
		for (int i = 2; i < li.size(); i++) {
			Integer h = li.get(i);
			System.out.println(h);
			
		}
		
		// for each loop
		for (Integer x : li) {
			System.out.println(x);
			
		}
		
		
	
	}

}
