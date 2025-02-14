//power of no
package org.tka.pkg;

public class C {
    public static int Power(int base,int expo)
    {
    	int result=1;
    	
    	for(int i=1;i<=expo;i++)
    	{
    		result*=base;
    	}
    	return result;
    }
    public static void main(String[] args) {
		System.out.println(Power(2, 4));
	}
}
