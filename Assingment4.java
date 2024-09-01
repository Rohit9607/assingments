package Assignment;

import java.util.Scanner;

public class Assingment4 {

	public static void main(String[] args) {
		//reverse a number
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		//using algorithm
		
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("The Reverse Number is:"+rev);

	}

}
