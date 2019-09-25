package testoneclass.juniorjavaactivities;

import java.io.IOException;
import java.util.Scanner;

//compute the average of three numbers.
public class C10R02 {
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
		System.out.print("Enter the Third number: ");
		int num3 = scanner.nextInt();
		// calling method
		avarage(num1, num2, num3);
		scanner.close();
	}

	static void avarage(int num1, int num2, int num3) {
		int sumOfNumbers = num1 + num2 + num3;
		double avagerages = sumOfNumbers / 3;
		System.out.println(avagerages + " is Average of numbers.");
	}

}
