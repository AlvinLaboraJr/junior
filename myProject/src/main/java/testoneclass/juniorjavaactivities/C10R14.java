package testoneclass.juniorjavaactivities;

import java.util.Scanner;

public class C10R14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of sides: ");
		int numberOfSide = input.nextInt();
		System.out.print("Input the side: ");
		double side = input.nextDouble();
		areaOfPentagon(numberOfSide, side);
		input.close();

	}

	public static void areaOfPentagon(int numberOfSide, double sides) {
		double areaofPen = (numberOfSide * sides * sides) / (4 * Math.tan(Math.PI / numberOfSide));
		System.out.println("The area of the pentagon: " + areaofPen);
	}

}
