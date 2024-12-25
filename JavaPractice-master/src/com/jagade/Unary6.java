package com.jagade;

public class Unary6 {
	public static void main(String[]args) {
		int x = 5 ;
		System.out.println("x: "+x); //5
		
		x++;
		System.out.println("x: "+x); //6
		
		x++;
		System.out.println("x: "+x); //7
		
		x--;
		System.out.println("x: "+x); //6
		
		x--;
		System.out.println("x: "+x); //5
		
		System.out.println("------------------"); 
		
		int i = 40;
		int j = i++ ;//Post increment ->First Assign, Then Increment
		System.out.println(i+" "+j); //41 40
		
		System.out.println("-------------------");
		
		int a = 5 ;
		int b = --a ; //Pre Decrement -> First decrement , then assign
		
		System.out.println(a+" " +b);//4 4
		
		System.out.println("-------------------");
		
		/* Ternary Operators
		 * 
		 *
		 */
		
		int p = 10 ;
		int q = 50 ;
		
		int max = p>q ? p : q ;
		System.out.println("Maximum of " +p+ " & " +q+ " is " +max);
	}

}
