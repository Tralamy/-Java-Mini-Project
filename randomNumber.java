package net.tralamy;
import java.util.Random;
import java.util.Scanner;

public class randomNumber {

	public static void main(String[] args) {



		Scanner scanLine = new Scanner(System.in);



		String userWantRandomNumber;
		String anOtherTry;
		boolean userWantRandomNumberBool = true;
		int r;

		do {
			System.out.print("[Yes | No]Hi user, do you want to get a random number:  ");
			userWantRandomNumber = scanLine.nextLine();
			if (userWantRandomNumber.equalsIgnoreCase("yes")) {
				System.out.println("Cool !");
			} else if(userWantRandomNumber.equalsIgnoreCase("no")) {
				userWantRandomNumberBool = false;
				System.out.println("Great! Good Bye =D");
			} else {
				System.err.println("Error: Invalid Input ");
			}
		} while (!userWantRandomNumber.equalsIgnoreCase("yes") && !userWantRandomNumber.equalsIgnoreCase("no"));

		while (userWantRandomNumberBool) {
			r = getRandom();
			System.out.println("Random number: " + r);

			do {
				System.out.print("[Yes | No]Do you want an other try: ");
				anOtherTry = scanLine.nextLine();
				if (anOtherTry.equalsIgnoreCase("yes")) {
					System.out.println("Cool !");
				} else if(anOtherTry.equalsIgnoreCase("no")) {
					userWantRandomNumberBool = false;
					System.out.println("Great! Good Bye =D");
				} else {
					System.err.println("Error: Invalid Input ");
				}
			} while (!anOtherTry.equalsIgnoreCase("yes") && !anOtherTry.equalsIgnoreCase("no"));

		}
		
		scanLine.close();
		System.out.println("\nProgram end");



	}

	public static int getRandom() {
		Random ran = new Random();
		int r = ran.nextInt();

		return r;
	}
}
