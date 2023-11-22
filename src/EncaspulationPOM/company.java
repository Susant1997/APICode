package EncaspulationPOM;

public class company {
	public static void main(String[] args) {
		employee e = new employee();
		e.setUserID(13456);
		e.setPassword("abcd1234");
		
		int id = e.getUserID();
		System.out.println(id);
		String pass = e.getPassword();
		System.out.println(pass);
	}
	
	
	

}
