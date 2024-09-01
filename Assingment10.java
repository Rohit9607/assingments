package AssignmentNew;

public class Assingment10 {

	public static void main(String[] args) {
		int a[]= {5,2,7,9,10,4,15};
		
		int sum=0;
		/*
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of array elements:"+sum);
		*/
		for(int value:a) {
			sum=sum+value;
		}
		System.out.println("Sum of array element is:"+sum);
	}

}
