package com.jagade;

public class GradeValidation14 {
	
	public static void main(String []args) {
		char grade = 'c' ;
		
		switch (grade)
		{
		case 'A' : System.out.println("Excellent -> Distinction");
		break ;
		
		case 'b' : System.out.println("Good -> First Class");
		break ;
		
		case 'c' : System.out.println("Bad -> Fail");
		break ;
		
		default: System.out.println("Invalid Grade");
		}
	}

}
