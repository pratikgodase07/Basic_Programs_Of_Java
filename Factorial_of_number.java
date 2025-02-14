//factorial of no.s
package org.tka.pkg;

public class B {
	
	public static int Factorial(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		
		int Factorial =1;
		
		for(int i=2;i<=n;i++)
		{
			Factorial*=i;
		}
		return Factorial;
	}
	
	
 public static void main(String[] args) {
	
	 int num=4;
	 
	 System.out.println("Factorial of "+num+"is"+Factorial(num));
}
}
