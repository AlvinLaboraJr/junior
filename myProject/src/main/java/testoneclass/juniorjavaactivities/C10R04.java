package testoneclass.juniorjavaactivities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// count all vowels in a string
public class C10R04 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String: ");
		String input = reader.readLine();
		// calling method
		countVawels(input);

	}

	public static void countVawels(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				count++;

			}
		}
		System.out.println("Number of Vowels in the String: " + count);
	}
}
