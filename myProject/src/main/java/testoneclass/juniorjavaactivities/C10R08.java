package testoneclass.juniorjavaactivities;

import java.util.Scanner;

public class C10R08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input the investment amount: ");
		double investmentAmount = sc.nextDouble();
		System.out.print("Input the rate of interest: ");
		double ramonthlyInterestRatete = sc.nextDouble();
		System.out.print("Input number of years: ");
		int years = sc.nextInt();

		ramonthlyInterestRatete *= 0.01;

		sc.close();
		System.out.println("Years	    FutureValue");
		for (int i = 1; i <= years; i++) {
			int formatter = 19;
			if (i >= 10)
				formatter = 18;
			System.out.printf(i + "%" + formatter + ".2f\n", futureInvestmentValue(investmentAmount, ramonthlyInterestRatete / 12, i));
		}
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

	}

}
