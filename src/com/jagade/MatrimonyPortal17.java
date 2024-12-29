package com.jagade;

public class MatrimonyPortal17 {
	
	public static void main(String[]args) {
		
		char gender = 'M' ;
		int age = 19 ;
		
		if(gender == 'M')
		{
			System.out.println("Gender is Male");
			
			if(age>=21)
			{
				System.out.println("Yes , you can get Maried");
			}
			else {
				System.out.println("Have Patience : ");
			}
		}
		else if(gender == 'f') {
			System.out.println("Gender is Female");
			
			if(age>=18)
			{
				System.out.println("Yes, you can get Married");
			}
			else {
				System.out.println("Have patience");
			}
		}
		else {
			System.out.println("Invalid");
		}
	}

}
