package Assignment;

import java.util.Scanner;

public class Assingnment8 {

	public static void main(String[] args) {
		//count number of even and odd digits in a number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0) {
			int rem=num%10;
			
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Number of even number:"+even_count);
		System.out.println("Number of odd numbers:"+odd_count);

	}

}
