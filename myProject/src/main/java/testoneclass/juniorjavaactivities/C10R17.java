package testoneclass.juniorjavaactivities;

import java.io.IOException;
import java.util.Scanner;

public class C10R17 {
	static double result = 0;

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		double num1 = 0, num2 = 0;
		char action = 0;
		do {
			displayMenu(num1, num2, action);
			System.out.print("The result of this operation is: " + result);
			System.out.println("Press C key and press ENTER to continue...");
			String continueC = scanner.nextLine();
			if (!continueC.equalsIgnoreCase("C")) {
				System.out.println("Goodbye...");
				System.exit(0);
				scanner.close();
			}
		} while (true);
	}

	public static void displayMenu(double num1, double num2, char action) throws IOException {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		num1 = scanner.nextDouble();
		System.out.print("Enter Second Number: ");
		num2 = scanner.nextDouble();
		System.out.println("<< Math Operation Menu >>");
		System.out.println("First Number : " + num1 + " Second number : " + num2);
		System.out.println("\n M - Multiplication \n D - Division \n A - Addition \n S - Subtraction \n Q - Quit \n");
		System.out.print("Enter your action:" + action);
		action = scanner.next().charAt(action);
		switch (action) {
		case 'Q':
		case 'q':
			System.out.println("\nShutDown");
			System.exit(0);
			break;
		case 'M':
		case 'm':
			multiplication(num1, num2);
			break;
		case 'D':
		case 'd':
			division(num1, num2);
			break;
		case 'A':
		case 'a':
			addition(num1, num2);
			break;
		case 'S':
		case 's':
			subraction(num1, num2);
			break;
		default:
			System.out.println("Invalid Action");
			
			break;
		}

	}

	public static double multiplication(double num1, double num2) {
		result = num1 * num2;
		return result;
	}

	public static double division(double num1, double num2) {
		result = num1 / num2;
		return result;
	}

	public static double addition(double num1, double num2) {
		result = num1 + num2;
		return result;
	}

	public static double subraction(double num1, double num2) {
		result = num1 - num2;
		return result;
	}
}
