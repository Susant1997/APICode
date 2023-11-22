package Day2_AbstractClass;

public class FullClass1 implements FullClass, ParentClass{

	public void employee() {
		System.out.println("Employ Details");
		
	}

	public void company() {
		System.out.println("Company Details");
		
	}
	
	private void personal() {
		System.out.println("Personal Details");

	}
	
	public void employeeId(int ID) {
		System.out.println(ID);
		
	}
	
	public static void main(String[] args) {
		FullClass1 f1 = new FullClass1();
		f1.employee();
		f1.company();
		f1.personal();
		f1.employeeId(123456);
	}

	

}
