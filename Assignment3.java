package Assignment;

import java.util.Scanner;

public class Assignment3 {
	//largest of 2 no. using ternary operator

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		int largest=a>b?a:b;
		System.out.println("largest number is"+largest);

	}

}
