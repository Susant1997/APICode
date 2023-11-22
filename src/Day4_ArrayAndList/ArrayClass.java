package Day4_ArrayAndList;

public class ArrayClass {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		// to find the length of the array
		int l = a.length;
		System.out.println(l);
		
		// to find out the particular value of array
		System.out.println(a[2]);
		
		// for loop (a.length = l)
		
		for (int i = 0; i < l; i++) {
			System.out.println(a[i]);
			
		}
		
		for (int i = 1; i < l; i++) {
			System.out.println(a[i]);
			
		}
		
		// for each loop
		
		for (int i : a) {
			System.out.println(i);
			
		}
		
	}

}
