package com.jagade;

public class NestedForLoop21 {
	
	public static void main(String[]args) {
		
		for(int i = 1 ; i <= 3 ; i++)
		{
			for(int j = 5 ; j <= 6 ; j++)
			{
				System.out.println("i: "+i+ " j: "+j);
			}
			
			System.out.println("------------------------");
		}
		
		for(int i= 1; i <= 5 ; i++)
		{
			for( int j = 1; j <= 5 ; j++)
			{
			System.out.print("* ");
		}
		
		System.out.println();
	}

}
}