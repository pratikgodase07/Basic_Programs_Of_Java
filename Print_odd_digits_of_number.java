//method to print odd digits of number
package org.tka.pkg;

public class J {
	public static void Odddigit(int num)
	{
		num=Math.abs(num);  //convert negative to positive
		System.out.println("Odd digits are: ");
	
	
		while(num>0) {
			int digit =num%10; //get last digit
			
			if(digit%2!=0)
			{
				System.out.println(digit+"");  //print odd digit
				
			}
			num/=10;  //remove last digit
		}
	}

	 public static void main(String[] args) {
		Odddigit(-123579);
	}
}
   
