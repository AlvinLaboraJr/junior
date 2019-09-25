package testoneclass.juniorjavaactivities;

import java.io.IOException;
import java.util.Scanner;

//compute the sum of the digits in an integer
public class C10R06 {
	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int input;
		System.out.print("Enter the number:");
		input = scanner.nextInt();
		//calling method
		sum(input);
		scanner.close();
	}

	public static void sum(int input) {
		int sum = 0;

		while (input > 0) {
			sum = sum + input % 10;
			input = input / 10;
		}
		System.out.println("Sum of Digits:" + sum);
	}
}
