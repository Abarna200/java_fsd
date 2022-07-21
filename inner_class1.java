package assist_practice;

public class inner_class1 {
	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+",  Inner Classes");}  
	 }  


	public static void main(String[] args) {

		inner_class1 obj=new inner_class1();
		inner_class1.Inner in=obj.new Inner();  
		in.hello();  
	}
}


