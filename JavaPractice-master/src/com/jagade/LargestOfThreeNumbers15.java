package com.jagade;

public class LargestOfThreeNumbers15 {
	
	public static void main(String[]args) {
		
		int a = 20 ;
		int b = 150 ;
		int c = 10 ;
		
		System.out.println("a: "+a+" b:"+b+" c:"+c);
		
		if(a>b)
		{
			if(a>c) {
				System.out.println("a ia Largest");
			}
			else {
				System.out.println("c is Largest");
			}
		}
		else if(b>c) {
			System.out.println("b is Largest");
		}
		else {
			System.out.println("c is Largest");
		}
		
		System.out.println("-----------------------------");
		
		if(a>b && a>c) {
			System.out.println("a is Largest");
		}
		else if(b>a && b>c) {
			System.out.println("b is Largest");
		}
		else {
			System.out.println("c is Largest");
		}
	}

}
