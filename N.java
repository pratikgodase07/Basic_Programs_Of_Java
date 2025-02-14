//method to print sum of cube of odd digits of number which is given by user
package org.tka.pkg;
import java.util.Scanner;

public class N {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num=sc.nextInt();  //take user input
		
		sc.close();
		
		int sum=0;
		num=Math.abs(num); //convert negative integers to positive
		
		while(num>0)
		{
			int digit =num%10; //get last digit
			
			if(digit%2!=0)
			{
				sum+=digit*digit*digit;
			}
			num/=10; //remove last digit
		}
		
		System.out.println("Sum of cube of odd digits: "+sum);
	}

}

