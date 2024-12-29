package com.jagade;

/* Accessing Non-Static Variables in Another Class
 * 
 */

public class Test24 {

	public static void main(String[]args) {
		
		Employee23 emp = new Employee23() ;
		
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.salary);
	}
}
