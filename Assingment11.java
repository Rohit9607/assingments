package AssignmentNew;

public class Assingment11 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		
		//extracting even number
		System.out.println("Even number in array:");
		//normal for loop
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
			
		}
		System.out.println("Odd number in array:");
		for (int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("By enhanced for loop even number:");
		//enhanced for loop
		for(int value:a)
		{
			if(value%2==0) {
				System.out.println(value);
			}
		}
		System.out.println("By enhanced for loop odd numbers:");
		
		for(int value:a) {
			if(value%2!=0) {
				System.out.println(value);
			}
		}
	}

}
