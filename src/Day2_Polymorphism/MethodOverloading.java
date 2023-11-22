package Day2_Polymorphism;

public class MethodOverloading {
	
	public void employee() {
		System.out.println("Employee Details");

	}
	
	public void employee(String name ) {
		System.out.println("Employ Name :"+ name);

	}
	
	public void employee(int id) {
		System.out.println("ID :" + id);

	}
	
	public void employee(String email, int phone) {
		System.out.println(email);
		System.out.println(phone);

	}
	
	public void employee(String addressline1, String addressline2) {
		System.out.println(addressline1);
		System.out.println(addressline2);

	}
	
	public void employee(String city, String state, int postcode) {
		System.out.println(city);
		System.out.println(state);
		System.out.println(postcode);

	}
	
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.employee();
		m.employee("Susant");
		m.employee(4);
		m.employee("susant@gmail.com", 1234);
		m.employee("3 Harlech Glen", "Bethlehem");
		m.employee("Tauranga", "Bay of plenty", 3110);
	}

}
