//count of digit of no
package org.tka.pkg;

public class E {
	public static int Countofdigit(int num) {
		return String.valueOf(num).length();  //convert no to string and get length
	}
	
	public static void main(String[] args) {
		System.out.println(Countofdigit(54));
	}
}
