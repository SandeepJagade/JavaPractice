package com.jagade; 


// Accessing Non-Static Variables inside same Class  
public class Student22 {
	
	// Non-Static Variables
	
	int age = 20 ;
	String name = "Dinga" ;
	
	public static void main(String[]args) {
		
		System.out.println("Start");
		System.out.println("********");
		
		Student22 stud = new Student22() ; // OBJECT CREATION
		
		System.out.println(stud.age);
		System.out.println(stud.name);
		
		System.out.println("--------------------------------------");
		
		System.out.println("Age: "+stud.age);
		System.out.println("Name: "+stud.name);
		
		System.out.println("-----------------------------------------");
		
		System.out.println(stud.name+" is "+stud.age+" years old");
		
		System.out.println("***********************");
		System.out.println("End");
	}

}
