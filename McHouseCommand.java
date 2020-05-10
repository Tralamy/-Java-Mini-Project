package net.tralamy;
import java.util.ArrayList;
import java.util.Scanner;

public class McHouseCommand {

	public static void main(String[] args) {
		Scanner scanInt = new Scanner(System.in);
		Scanner scanLine = new Scanner(System.in);

		String mainMenu[] = {"McBurger", "McTrio", "Fries" , "Nothing"};
		String drinkMenu[] = {"Coca", "Pepsi", "Coffe", "Nothing"};
		String sauceMenu[] = {"Ketchup", "Moutarde", "Mayo", "Nothing"};
		int mainI = -1;
		int drinkI = -1; 
		int sauceI = -1;

		ArrayList<Integer> mainMenuChoice = new ArrayList<Integer>(); 
		ArrayList<Integer> drinkMenuChoice = new ArrayList<Integer>();
		ArrayList<Integer> sauceMenuChoice = new ArrayList<Integer>();
		boolean mainRetake, drinkRetake, sauceRetake;
		boolean mainWhilePass = false, drinkWhilePass = false, sauceWhilePass = false;
		String mainRetakeAnswer, drinkRetakeAnswer, sauceRetakeAnswer;

		System.out.println("Welcome to McHouse ! "+"\n");

		/* Main Menu *//* Main Menu *//* Main Menu *//* Main Menu *//* Main Menu *//* Main Menu *//* Main Menu *//* Main Menu *//* Main Menu */

		do {
			mainI ++;
			do {
				System.out.println("\nMain menu:\n");

				for (int i = 0; i < mainMenu.length; i++) {
					int menuNumber = i + 1;
					System.out.println(menuNumber + ": "+ mainMenu[i]);
				}
				try {
					System.out.print("The number of your choice: ");
					if (scanInt.hasNextInt()) {
						mainMenuChoice.add(scanInt.nextInt());      // exeption here

						if(mainMenuChoice.get(mainI) > mainMenu.length || mainMenuChoice.get(mainI) <= 0) {
							mainWhilePass = false;
							mainMenuChoice.remove(mainI);

						} else {
							mainWhilePass = true;
						}
					} else {
						System.err.print("Not valid choice: " + scanInt.next());
						mainI -= 1;
					}
				} catch (Exception e) {
					System.err.println("Error: " + e);
					scanInt.next();
				}

			} while (!mainWhilePass);
			do {

				System.out.print("\n[Yes | No] Do you want to retake: ");
				mainRetakeAnswer = scanLine.nextLine();

			} while (!mainRetakeAnswer.equalsIgnoreCase("yes") && !mainRetakeAnswer.equalsIgnoreCase("no"));

			if (mainRetakeAnswer.equalsIgnoreCase("yes")) {
				mainRetake = true;
			} else {
				mainRetake = false;
			}
		} while (mainRetake);

		System.out.println("");

		/* Drink Menu *//* Drink Menu *//* Drink Menu *//* Drink Menu *//* Drink Menu *//* Drink Menu *//* Drink Menu *//* Drink Menu */

		do {
			drinkI ++;
			do {
				System.out.println("\nDrink menu:\n");

				for (int i = 0; i < drinkMenu.length; i++) {
					int menuNumber = i + 1;
					System.out.println(menuNumber + ": "+ drinkMenu[i]);
				}
				System.out.print("The number of your choice: ");

				drinkMenuChoice.add(scanInt.nextInt());

				if(drinkMenuChoice.get(drinkI) > drinkMenu.length || drinkMenuChoice.get(drinkI) <= 0) {
					drinkWhilePass = false;
					drinkMenuChoice.remove(drinkI);
				} else {
					drinkWhilePass = true;
				}
			} while (!drinkWhilePass);
			do {
				System.out.print("\n[Yes | No] Do you want to retake: ");
				drinkRetakeAnswer = scanLine.nextLine();

			} while (!drinkRetakeAnswer.equalsIgnoreCase("yes") && !drinkRetakeAnswer.equalsIgnoreCase("no"));
			if (drinkRetakeAnswer.equalsIgnoreCase("yes")) {
				drinkRetake = true;
			} else {
				drinkRetake = false;
			}
		} while (drinkRetake);
		System.out.println("");
		/* Sauce Menu *//* Sauce Menu *//* Sauce Menu *//* Sauce Menu *//* Sauce Menu *//* Sauce Menu *//* Sauce Menu *//* Sauce Menu */
		do {
			drinkI ++;
			do {
				System.out.println("\nDrink menu:\n");
				for (int i = 0; i < drinkMenu.length; i++) {
					int menuNumber = i + 1;
					System.out.println(menuNumber + ": "+ drinkMenu[i]);
				}
				try {
					System.out.print("The number of your choice: ");
					if (scanInt.hasNextInt()) {
						drinkMenuChoice.add(scanInt.nextInt());      // exeption here
						if(drinkMenuChoice.get(drinkI) > drinkMenu.length || drinkMenuChoice.get(drinkI) <= 0) {
							drinkWhilePass = false;
							drinkMenuChoice.remove(drinkI);

						} else {
							drinkWhilePass = true;
						}
					} else {
						System.err.print("Not valid choice: " + scanInt.next());
						drinkI -= 1;
					}
				} catch (Exception e) {
					System.err.println("Error: " + e);
					scanInt.next();
				}








			} while (!drinkWhilePass);


			do {

				System.out.print("\n[Yes | No] Do you want to retake: ");
				drinkRetakeAnswer = scanLine.nextLine();

			} while (!drinkRetakeAnswer.equalsIgnoreCase("yes") && !drinkRetakeAnswer.equalsIgnoreCase("no"));

			if (drinkRetakeAnswer.equalsIgnoreCase("yes")) {
				drinkRetake = true;
			} else {
				drinkRetake = false;
			}
		} while (drinkRetake);

		System.out.println("");


		/* What did you buy *//* What did you buy *//* What did you buy *//* What did you buy *//* What did you buy *//* What did you buy */

		do {
			sauceI ++;
			do {

				System.out.println("\nSauce menu:\n");

				for (int i = 0; i < sauceMenu.length; i++) {
					int menuNumber = i + 1;
					System.out.println(menuNumber + ": "+ sauceMenu[i]);
				}


				try {
					System.out.print("The number of your choice: ");
					if (scanInt.hasNextInt()) {
						sauceMenuChoice.add(scanInt.nextInt());      // exeption here

						if(sauceMenuChoice.get(sauceI) > sauceMenu.length || sauceMenuChoice.get(sauceI) <= 0) {
							sauceWhilePass = false;
							sauceMenuChoice.remove(sauceI);

						} else {
							sauceWhilePass = true;
						}
					} else {
						System.err.print("Not valid choice: " + scanInt.next());
						sauceI -= 1;
					}
				} catch (Exception e) {
					System.err.println("Error: " + e);
					scanInt.next();
				}
			} while (!sauceWhilePass);
			do {
				System.out.print("\n[Yes | No] Do you want to retake: ");
				sauceRetakeAnswer = scanLine.nextLine();

			} while (!sauceRetakeAnswer.equalsIgnoreCase("yes") && !sauceRetakeAnswer.equalsIgnoreCase("no"));

			if (sauceRetakeAnswer.equalsIgnoreCase("yes")) {
				sauceRetake = true;
			} else {
				sauceRetake = false;
			}
		} while (sauceRetake);

		System.out.println("");
		/* Program end *//* Program end *//* Program end *//* Program end *//* Program end *//* Program end *//* Program end */

		scanLine.close();
		scanInt.close();

		System.out.println("\n\nProgarm end");


	}

}
