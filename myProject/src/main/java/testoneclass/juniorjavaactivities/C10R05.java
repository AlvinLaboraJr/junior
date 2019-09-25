package testoneclass.juniorjavaactivities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//count all words in a string
public class C10R05 {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input the String: ");
		String input = reader.readLine();
		//calling method
		countWords(input);
	}

	public static void countWords(String input) {

		int count = 0;
		if (!(" ".equals(input.substring(0, 1))) || (!" ".equals(input.substring(input.length() - 1)))) {
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == ' ') {
					count++;
				}
			}
			count = count + 1;
		}
		System.out.println("Number of words in the string: " + count);
	}
}
