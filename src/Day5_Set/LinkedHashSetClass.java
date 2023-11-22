package Day5_Set;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedHashSetClass {
	
	public static void main(String[] args) {
		// InterfaceName VariableName = new Classtype();
		Set<Integer> s = new LinkedHashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(50);
		s.add(40);
		s.add(5);
		
		System.out.println(s);
		
		int i = s.size();
		System.out.println(i);
		
		s.remove(20);
		System.out.println(s);
		
		boolean b = s.isEmpty();
		System.out.println(b);
		
		
		for (Integer l : s) {
			System.out.println(l);
			
		}
		
		// to convert set into list
		
		List<Integer> li = new LinkedList(s);
		System.out.println("List value" + li);
		
		for (int j = 2; j < li.size(); j++) {
			Integer h = li.get(j);
			System.out.println(h);
			
		}
		
		s.clear();
		System.out.println(s);
		
		
		
	}

}




