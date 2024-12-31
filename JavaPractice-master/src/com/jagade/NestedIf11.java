package com.jagade;

public class NestedIf11 {
	
	public static void main(String[]args) {
		
		int a = 70 ;
		if(a<=10) //false outer if
		{
			System.out.println("Insider Outer If ");
			
			if(a==5) // Inner If
			{
				System.out.println("a is equal to 5");
			}
			else // Inner else
			{
				System.out.println("a is not equal to 5");
			}
		}
		else // outer else
		{
			System.out.println("a is greater than 10");
		}
	}

}
