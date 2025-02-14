//product of digit of no
package org.tka.pkg;

public class F {
	public static int Productofdigit(int num)
	{
		int product=1;
		
		while(num>0)
		{
			product*=num%10; //multiply last digit
			
			num/=10;  //remove last digit
		}
		return product;
	}
	
	public static void main(String[] args) {
		System.out.println(Productofdigit(42678));
	}

}
