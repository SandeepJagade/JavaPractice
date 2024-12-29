package com.jagade;

public class AssignmentPrograms15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = -10 ;
		
		if(num>0) 
		{
			System.out.println(num+" is a Positive Number");
		}
		else {
			System.out.println(num+" is a Negative Number");
		}
		
		System.out.println("-----------------------------------");
		
		int n = 215 ;
		
		if(n%2 == 0) // if(215%2 == 0 ) -> 1 == 0
		{
			System.out.println(n+" is a Even Number");
		}
		
		else {
			System.out.println(n+" is a Odd Number");
		}
		
		System.out.println("--------------------------------------");
		
		int a = 20 ;
		int b = 20 ;
		
		System.out.println("a: "+a+ " +9b: "+b);
		
		if(a>b) {
			System.out.println("a is Largest");
		}
		else if(a<b) //b>a
		{
			System.out.println("b ia Largest");
		}
		else {
			System.out.println("a and b are both equal");
		}

	}

}
