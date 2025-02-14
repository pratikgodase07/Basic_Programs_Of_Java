package org.tka.pkg;

//import java.io.PrintStream;

public class G {
	public void Printsquare(int num)
	{
		while(num>0)
		{
			int digit=num%10;
			
			System.out. println(digit+ "^2= "+(digit*digit));
			num/=10;
		}
	}
	
	public static void main(String[] args) {
		G obj=new G();
		int number=1234;
		
		//printing squares of digit
		obj.Printsquare(number);
	}

}
