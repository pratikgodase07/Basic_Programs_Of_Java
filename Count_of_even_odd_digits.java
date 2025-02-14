
//method to print count of even digits and odd digits of no given by user
package org.tka.pkg;

import java.util.Scanner;

public class O {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num=scanner.nextInt();
		scanner.close();
		
		//for even count
		int evencount=0, oddcount=0;
		
		num=Math.abs(num); //convert negative to positive
		
			while(num>0)
			{
				int digit=num%10; //get the last digit of number
				
				if(digit%2==0) {  //if digit divide by 2 then digit is even
				
					evencount++; //count even digits
				}
				else {
					oddcount++;
				}
				num/=10;
			}
			System.out.println("Even count of digit is: "+evencount);
			System.out.println("Odd count of digits is: "+oddcount);
	}

}
