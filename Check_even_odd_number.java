//method to check no is even or odd
package org.tka.pkg;

public class L {
	public static boolean Evenno(int num) {
		
		return num%2==0;
		
	}
	public static void main(String[] args) {
		int number=13; //example no
		
		if(Evenno(number))
		{
			System.out.println(number+" is an even number...");
			
		}
		else {
			System.out .println(number+" is an odd number...");
		}
	}

}
