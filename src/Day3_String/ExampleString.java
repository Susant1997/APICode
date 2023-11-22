package Day3_String;

public class ExampleString {
	
	public static void main(String[] args) {
		
		String s1 = "Welcome";
		System.out.println(s1);
		
		// to find the length of the String 
		int length = s1.length(); // first write s1.length() and  Ctrl + 2 and press L 
		System.out.println(length);
		
		
		// to find whether the string is start with the particular value or not
		boolean b = s1.startsWith("w");
		System.out.println(b);
		
		boolean c = s1.startsWith("Wel");
		System.out.println(c);
		
		// to find whether the string is start with the particular value or not
		boolean d = s1.endsWith("come");
		System.out.println(d);
		
		boolean e = s1.endsWith("E");
		System.out.println(e);
		
		// To convert all the value into Uppercase of the string
		String f = s1.toUpperCase();
		System.out.println(f);
		
		// To convert all the value into Lowercase of the string
		String g = s1.toLowerCase();
		System.out.println(g);
		
		// to find the index of the particular character
		int h = s1.indexOf("W");
		System.out.println(h);
		
		int i = s1.lastIndexOf("e");
		System.out.println(i);
		
		int k = s1.indexOf("e", 4);
		System.out.println(k);
		
		// to get the particular char from the index
		char p = s1.charAt(5);
		System.out.println(p);
		
		// to find the string is empty or not
		boolean j = s1.isEmpty();
		System.out.println(j);
		
		// to find the particular value present in the string 
		boolean l = s1.contains("To");
		System.out.println(l);
		
		boolean m = s1.contains("co");
		System.out.println(m);
		
		String s2 = "Welcome To Java Class";
		String s3 = "welcome";
			
		boolean n = s1.equals(s3);
		System.out.println(n);
		
		boolean o = s1.equalsIgnoreCase(s3);
		System.out.println(o);
		
		// to replace the value
		String q = s1.replaceAll("e", "#");
		System.out.println(q);
		
		// to get the particular portion of the string
		String r = s2.substring(7);
		System.out.println(r);
	
		String s = s2.substring(8);
		System.out.println(s);
		
		String t = s2.substring(0 , 12);
		System.out.println(t);
		
		// To remove unwanted space in the string
		String trim = r.trim();
		System.out.println(trim);
		
		// To joint two string
		String v = s1.concat(s2);
		System.out.println(v);
		
		// to find the memory locations
		
		int u = System.identityHashCode(s1);
		System.out.println(u);
		
		int w = System.identityHashCode(s3);
		System.out.println(w);
		
		// if s1==s3
		
		boolean x = s1.equals(s3);
		System.out.println(x);
		
		
		
	}

	
}
