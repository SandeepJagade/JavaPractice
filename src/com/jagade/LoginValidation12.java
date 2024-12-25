package com.jagade;

public class LoginValidation12 {
	public static void main(String[]args)
	{
		String id = "adminxyz" ;
				int password =123 ;
				
				if(id== "admin"){
					System.out.println("User is Valid");
					
					if(password == 123) {
					System.out.println("Password is Valid");
					System.out.println("Login Successful :) ");
				}
				
				else {
					System.out.println("Password is Invalid");
					System.out.println("Login Unsuccessful :( " );
				}
				
	}
	else {
		
		System.out.println("UserId is Invalid");
		System.out.println("Login Unsuccsseful");
		
	}

}
}