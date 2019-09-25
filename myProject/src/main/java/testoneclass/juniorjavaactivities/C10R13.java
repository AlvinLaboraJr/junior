package testoneclass.juniorjavaactivities;

import java.util.Scanner;

public class C10R13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int side1;
		int side2;
		int side3;
		
		System.out.print("Enter side1: ");
		side1 = sc.nextInt();
		System.out.print("Enter side2: ");
		side2 = sc.nextInt();
		System.out.print("Enter side3: ");
		side3 = sc.nextInt();
		areaOfTriangle(side1, side2, side3);
		sc.close();
	}

	public static void areaOfTriangle(double side1, double side2, double side3) {

		if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
			double area = (side1 + side2 + side3) / 2;
			double areaOfTriangle = Math.sqrt(area*(area-side1)*(area-side2)*(area-side3));
			System.out.println("The area of pentagon is: " + areaOfTriangle);
		}
		else {
			System.out.println("Area does not exist");
		}
	}
}
