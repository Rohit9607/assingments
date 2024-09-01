package Assignment;

import java.util.Scanner;

public class Assingment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Palindrome number:
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int org_num=num;
		
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println(org_num+"Palindrome num");
		}
		else {
			System.out.println("Not palindrome num");
		}
	}

}
