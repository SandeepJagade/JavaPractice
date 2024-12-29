package com.jagade;

public class WhileLoop20 {
	
	public static void main(String[]args) {
		
		int n = 1 ;
		while(n<=5) {
			
			System.out.println(n);
			n++ ;
		}
		
		System.out.println("--------------------");
		
		int x = 1 ;
		do
		{
			System.out.println(x);
			x++ ;
		}
		while(x <= 5) ;
		
		System.out.println("---------------------");
		
		int i = 5 ;
		while(i >= 1) 
		{
			System.out.println(i);
			i-- ;
		}
		
		System.out.println("---------------------------");
		
		int j = 5 ;
		do
		{
			System.out.println(j);
			j-- ;
		}
		while(j >= 1) ;
	}

}
