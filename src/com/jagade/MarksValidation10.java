package com.jagade;

public class MarksValidation10 {

	public static void main (String[]args) {
		
		int marks = -7 ;
		if(marks>81 && marks<=100)
		{
			System.out.println("Distinction");
		}
		else if(marks>=35 && marks<=80)
		{
			System.out.println("first class");
		}
		else if(marks>=0 && marks<=34) {
			
			System.out.println("Fail,Study Well !! : ");
			
		}
		else {
			System.out.println("Invalid Marks");
		}
	}
}
