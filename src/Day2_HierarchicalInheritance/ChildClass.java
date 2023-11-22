package Day2_HierarchicalInheritance;

public class ChildClass extends ParentClass{
	
	private void company() {
		System.out.println("Road Ninja");

	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.company();
		c.employee();
		c.employeeID();
		
		
	}

}
