package assist_practice;

public class access_modifier {
	public void Public() {
		System.out.println("This is public method");
	}
	
	private void Private() {
		System.out.println("This is private method");
	}
	
	protected void Protected() {
		System.out.println("This is protected method");
	}
	void Default() {
		System.out.println("This is default method");
	}
	public static void main(String [] args) {
		
		access_modifier obj= new  access_modifier();
		
		obj.Public();
		obj.Private();
		obj.Protected();
		obj.Default();
	}
}
