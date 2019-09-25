package testoneclass.opp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final AtomicInteger count = new AtomicInteger(0);

	public static String action;
	public static Dao studentDao = new Service();

	public static void main(String[] args) throws IOException {

		do {
			System.out.println("\n'select your action'");
			System.out.println("1: Add");
			System.out.println("2: View Profile");
			System.out.println("0: Exit!");
			action = br.readLine();
			getAction(action);
		} while (!action.equals("0"));

	}

	public static void getAction(String action) throws IOException {

		switch (action) {
		case "1":
			System.out.println(Utils.addStudent());
			break;
		case "2":
			System.out.println(Utils.viewStudent());
			break;
		case "0":
			System.exit(0);
			break;
		default:
			break;
		}
	}
}
