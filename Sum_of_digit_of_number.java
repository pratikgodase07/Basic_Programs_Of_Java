//sum of digit of no
package org.tka.pkg;

public class D {
	public static int Sumofdigits(int num) {
		int sum=0;
		
		while(num>0)
		{
			sum+=num%10;  //add last digit
			
			num/=10; //remove last digit
		}
		 return sum;
	}
	public static void main(String[] args) {
		System.out.println(Sumofdigits(42678));
	}
	

}
