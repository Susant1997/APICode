package Day5_Set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		
		Map<Integer, String> mp = new HashMap();
		// HashMap display the outcomes randomly and only accept one null key and n numbers of null value
		mp.put(null, "JAVA"); // mp.put(Key, "Value")
		mp.put(20, null);
		mp.put(30, "Selenium");
		mp.put(40, null);
		
		System.out.println(mp);
		
		// to find the size
		int s = mp.size();
		System.out.println(s);
		
		// to get all the key from map
		Set<Integer> keySet = mp.keySet();
		System.out.println(keySet);
		
		// to get all the value from map
		Collection<String> values = mp.values();
		System.out.println(values);
		
		// to check whether the key is present or not
		boolean b = mp.containsKey(50);
		System.out.println(b);
		
		// to check the whether the value is present or not
		boolean c = mp.containsValue("JAVA");
		System.out.println(c);
		
		// to remove the values using key
		mp.remove(30);
		System.out.println(mp);
		
		// to get the particular value from map using key
		String d = mp.get(40);
		System.out.println(d);
		
		// to convert map into set
		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			
		}
		
		List<Integer> li = new LinkedList(entrySet);
		System.out.println("List value" + li);
		
//		for (int j = 20; j < mp.size(); j++) {
//			String e = mp.get(j);
//			System.out.println(e);
//			
//		}
		
		
	}
	

}
