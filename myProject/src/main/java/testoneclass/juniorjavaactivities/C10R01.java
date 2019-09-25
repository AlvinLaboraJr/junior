package testoneclass.juniorjavaactivities;

import java.util.Scanner;

//find the smallest number among three numbers
public class C10R01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number");
		int num2 = scanner.nextInt();
		System.out.print("Enter the Third number");
		int num3 = scanner.nextInt();
		// calling method
		smallest(num1, num2, num3);
		scanner.close();
	}

	static void smallest(int num1, int num2, int num3) {
		if (num1 <= num2 && num1 <= num3) {
			System.out.println(num1 + " is the smallest number");

		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println(num2 + " is the smallest number");

		} else {
			System.out.println(num3 + " is the smallest number");

		}
	}

}
