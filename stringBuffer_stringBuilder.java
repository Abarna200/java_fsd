package assist_practice;

public class stringBuffer_stringBuilder {
	public static void main(String[] args) {
		
	// create a string
	String str= "Hello";
	System.out.println("a string str has been created");
	//conversion of string to stringBuffer
	StringBuffer sbf=new StringBuffer(str);
	sbf.reverse();
	System.out.println("\n String to stringBuffer");
	System.out.println(sbf);
	//conversion of string to stringBuilder
	StringBuilder sbd=new StringBuilder(str);
	sbd.append("world");
	System.out.println("\n string to stringBuilder");
	System.out.println(sbd);
	}
}
