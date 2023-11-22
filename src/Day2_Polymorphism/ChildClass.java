package Day2_Polymorphism;

public class ChildClass extends ParentClass{
	
	private void company() {
		System.out.println("Road Ninja");

	}
	
	@Override
	public void employeeID(int id) {
		System.out.println("789");
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.company();
		c.employee();
		c.employeeID(456);
		
		
	}

}
