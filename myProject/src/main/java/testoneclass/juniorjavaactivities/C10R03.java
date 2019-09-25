
package testoneclass.juniorjavaactivities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//display the middle character of a string
public class C10R03 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Input a String: ");
		String str = reader.readLine();
		//calling method
		middle(str);
	}

	public static void middle(String str) {

		int position;
		int length;
		if (str.length() % 2 == 0) {
			position = str.length() / 2 - 1;
			length = 2;
		} else {
			position = str.length() / 2;
			length = 1;
		}
		String strr = str.substring(position, position + length);
		System.out.print("The middle character in the string: " + strr + "\n");

	}

}
