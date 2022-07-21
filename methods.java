package assist_practice;

public class methods {
	public int average (int a,int b,int c,int d) {
		int avg=(a+b+c+d)/4;
		return avg;
	}
public static void main(String[] args) {
	methods obj = new methods();
	int g=obj.average(89, 99, 97, 90);
	System.out.println("The average is"+g);
}
	
}

