package Day2_AbstractClass;

public class AbstractClass1 extends AbstractClass {

	@Override
	public void company() {
		System.out.println("AbstractClass2 from avstract method class");
		
	}
	
	public void city() {
		System.out.println("Tauranga");

	}
	
	public static void main(String[] args) {
		AbstractClass1 ab = new AbstractClass1();
		ab.employee();
		ab.company();
		ab.city();
	}
	
	

}
