package assist_practice;

public class constructors {
	String name;
	int id;
	int percentage;
	public constructors (String name,int id,int percentage) {
		this.name=name;
		this.id=id;
		this.percentage=percentage;
	}
	public void result() {
		System.out.println("name of the student is "+name);
		System.out.println("id of the student is "+id);
		System.out.println("percentage of the student is "+percentage);
	}
	
	public static void main(String[] args) {
		constructors obj= new constructors("Abarna",24354,85);
		obj.result();
	}
}
