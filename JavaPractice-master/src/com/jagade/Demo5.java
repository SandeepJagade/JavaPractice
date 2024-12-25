package com.jagade;

public class Demo5 {
	
	public static void main(String[]args) {
		/* Comparison Operators 
		 * 
		 */
		int x = 10 ;
		int y = 20 ;
		
		System.out.println(x<y); //true
		System.out.println(x<=5); //false
		
		System.out.println("-----------------");
		
		System.out.println(y>50); //false
		System.out.println(y>=20); //true
		
		System.out.println("--------------------");
		
		System.out.println(x==y); //false
		System.out.println(x!=y);//true
		System.out.println(x==10);//true
		System.out.println(x!=10);//false
		
		System.out.println("--------------------------");
		
		/* Logical Operators 
		 * 
		 */
		
		int a = 1 ;
		int b = 2 ;
		boolean result = a<b && a==1 ;
		
		System.out.println(result); //true
		System.out.println(a<=4 && a==b); //false
		
		System.out.println("------------------------");
		
		System.out.println(a<5 || b== 5); //true
		System.out.println(a==b || b!=2); //false
		
		System.out.println("-------------------------");
		
		System.out.println(!true);//false
		System.out.println(!false);//true
		
		System.out.println(!(1<2)); //false
		System.out.println(!(20<5)); //true

		
		

		
	}

}
