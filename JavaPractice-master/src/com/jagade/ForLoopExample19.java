package com.jagade;

public class ForLoopExample19 {
	
	public static void main(String[]args) {
		
		int n = 5 ;
		int sum = 0 ;
		
		for(int i = 1 ; i <= n ; i ++)
		{
			sum = sum + i ; // sum += i ;
		}
		
		System.out.println("Sum : "+sum);
		
		System.out.println("----------------");
		
		//146 147 148 149 150
		for(int x = 146; x<=150 ; x++)
		{
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		
		//5 4 3 2 1 
		for(int i = 5; i>=1 ; i--)
		{
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		//2 4 6 8 10
		
		for(int i = 2 ; i<= 10 ; i=i+2)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------------");
	
	//1 3 5 7 9
		for(int i = 1 ; i<= 9 ; i +=2) {
			System.out.println(i);
		}
		System.out.println("-----------------------------");
	
		for(int i = 2 ; i <= 10 ; i +=2)
		{
			System.out.print(i+" ");
		}
	}
	
	

}
