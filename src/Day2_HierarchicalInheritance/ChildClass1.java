package Day2_HierarchicalInheritance;

public class ChildClass1 extends ParentClass{
	
	public void city() {
		System.out.println("Pokhara");
	}
	
	public static void main(String[] args) {
		ChildClass1 c1 = new ChildClass1();
		c1.employee();
		c1.employeeID();
		c1.city();
	}

}
