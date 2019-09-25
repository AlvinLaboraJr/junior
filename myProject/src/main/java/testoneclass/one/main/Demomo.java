package testoneclass.one.main;

import java.util.Scanner;

import testoneclass.one.util.ComUtil;

public class Demomo {
	public Scanner sc = new Scanner(System.in);
	public int type = 0;

	public void two() {
		do {
			ComUtil.viewOne();
			type = sc.nextInt();
			switch (type) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 0:
				System.out.println("Thank you!!!");
				break;
			default:
				System.out.println("Thank you!!!");
				System.exit(0);
			}
		} while (type != 0);

	}

	public static void main(String[] args) {
		Demomo out = new Demomo();

		out.two();

	}
}
