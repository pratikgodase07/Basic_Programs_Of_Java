//method to print even digits of number
package org.tka.pkg;

public class I {
	public static void Evendigit(int num)
	{
		num=Math.abs(num);  //convert negative to positive
		System.out.println("Even digits: ");
	
	
		while(num>0) {
			int digit =num%10; //get last digit
			
			if(digit%2==0)
			{
				System.out.println(digit+"");  //print even digit
				
			}
			num/=10;  //remove last digit
		}
	}

	 public static void main(String[] args) {
		Evendigit(-123579);
	}
}
   
