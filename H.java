package org.tka.pkg;

//import java.io.PrintStream;

public class H {
	public void Printcube(int num)
	{
		while(num>0)
		{
			int digit=num%10;
			
			System.out. println(digit+ "^3= "+(digit*digit*digit));
			num/=10;
		}
	}
	
	public static void main(String[] args) {
		H obj=new H();
		int number=1234;
		
		//printing cube of digit
		obj.Printcube(number);
	}

}
