package net.tralamy;
import  java.util.Scanner;
public class MiniCalculator {

	private static Scanner scStr;

	public static void main(String[] args) {
		try (Scanner scInt = new Scanner(System.in)) {
			scStr = new Scanner(System.in);
			
			int a, b,r;
			String choice;
			boolean goodchoice;
			
			
			System.out.println("Please, put the first number: ");
			a = scInt.nextInt();
			System.out.println(""); 
			
			System.out.println("Please, put the second number: ");
			b = scInt.nextInt();
			System.out.println("");
			
			
			do {
				
				System.out.println("Choice:");
				System.out.println("\tA: +");
				System.out.println("\tB: -");
				System.out.println("\tC: x");
				System.out.println("\tD: ÷");
				System.out.println("Enter the lettre of your choice: ");
				choice = scStr.nextLine();
				
				if(choice.equalsIgnoreCase("a")) {
					r = a + b;
					System.out.println("");
					System.out.println(": "+ a + " + "+ b + " = " + r + " :");
					goodchoice = true;
				} else if(choice.equalsIgnoreCase("b")){
					r = a - b;
					System.out.println("");
					System.out.println(": "+ a + " - "+ b + " = " + r + " :");
					goodchoice = true;
				} else if(choice.equalsIgnoreCase("c")) {
					r = a * b;
					System.out.println("");
					System.out.println(": "+ a + " x "+ b + " = " + r + " :");
					goodchoice = true;
				} else if(choice.equalsIgnoreCase("d")) {
					r = a / b;
					System.out.println("");
					System.out.println(": "+ a + " ÷ "+ b + " = " + r + " :");
					goodchoice = true;
				} else {
					goodchoice = false;
					System.out.println("");
					System.out.println("Please, insert a lettre from one of this: ");
					
				}
				
			} while (goodchoice == false);
		}
		System.out.println("\nProgram end");

	}

}
