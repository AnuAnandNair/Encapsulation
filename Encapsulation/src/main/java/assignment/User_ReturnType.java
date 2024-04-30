/*Qn) Program to withdraw amount from an ATM
 Class 1- Bank One method to set pin from „User‟ class and validate Pin in another method 
[Valid pins – 1001, 1234, 1212] 
 Pin number should declared as private 
 Class 2 – User Get the pin from Userpackage assignment;*/

package assignment;

import java.util.Scanner;

public class User_ReturnType {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter pin: ");
		int pin=s1.nextInt();
		
		Bank_ReturnType bank1=new Bank_ReturnType();
		bank1.setPin(pin);
		boolean b=bank1.validatePin();		
		if(b==true) {
			System.out.println("The pin is valid");
		}else {
			System.out.println("The pin is invalid");
		}
	}

}
