package assignment;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter pin: ");
		int pin=sc1.nextInt();
		
		Bank bank=new Bank();
		bank.setPin(pin);
		bank.validatePin();			
	}

}
