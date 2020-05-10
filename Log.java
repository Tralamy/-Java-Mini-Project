package net.tralamy;
import java.util.Scanner;

public class Log {

	public static void main(String[] args) {
		Scanner scanLine = new Scanner(System.in);
		
		String userName, userPassword;
		String userNameVerif, userPasswordVerif;
		
		boolean pass = true;
		
		System.out.println("Hello user !\n\n");
		
		
		System.out.println("Sign in:\n");
		
		System.out.print("Please, enter a user name: ");
		userName = scanLine.nextLine();
		
		System.out.print("Please, enter a password: ");
		userPassword = scanLine.nextLine();
		
		do {

			System.out.println("\n");
			
			System.out.println("Login:\n");
			
			System.out.print("Please, enter your user name: ");
			userNameVerif = scanLine.nextLine();
			
			System.out.print("Please, enter your password: ");
			userPasswordVerif = scanLine.nextLine();
			
			if (userName.equalsIgnoreCase(userNameVerif) && userPassword.equals(userPasswordVerif)) {
				System.out.println("You'r Connected! =D ");
				pass = false;
			} else {
				System.err.println("Error: Username or Password Invalid!");
			}
			
		} while (pass);
		
		
		scanLine.close();
		
		System.out.println("\nProgram end");

	}

}
