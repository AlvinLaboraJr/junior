package testoneclass.juniorjavaactivities;

import java.util.Scanner;

public class C10R10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input a year: ");
		int year = sc.nextInt();

		isLeapYear(year);
		sc.close();
	}

	public static void isLeapYear(int year) {
		boolean a = (year % 4) == 0;
		boolean b = (year % 100) != 0;
		boolean c = ((year % 100 == 0) && (year % 400 == 0));

		boolean result = a && (b || c);
		System.out.println(result);

	}

}
