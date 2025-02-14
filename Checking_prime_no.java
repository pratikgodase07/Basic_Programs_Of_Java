//method to check no is prime or not
package org.tka.pkg;



public class K {
	public static boolean Primeno(int num)
	{
		if(num<=1)
		
			return false;
			
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				
					return false;
				
			}
			return true;
		
	}
		
		public static void main(String []args) {
			int number=23; //example
			
			if(Primeno(number))
			{
				System.out.println(number+" is a prime number");
			}
			else {
				System.out.println(number+" is not a prime number");
			}
		}
		
			 
	}


