package assist_practice;

public class implementation_of_array {
	public static void main(String[] args) {
		//single dimensional array
		System.out.println("Single dimensional array");
		int arr[]= {1,2,5,9,4};
		for(int i=0;i<3;i++) {
			System.out.println("Elecments of the array arr :"+arr[i]);
		}
		//multi dimensional array
		System.out.println("Multi Dimensional array");
		int b[][]= {
				{1,2,3,4},
				{8,9,6,5,4}};
		System.out.println("number of elements in row 1 = "+b[0].length+
				"\n number of elements in row 2 = "+b[1].length);

		}
	}

