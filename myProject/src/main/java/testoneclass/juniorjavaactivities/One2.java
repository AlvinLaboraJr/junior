package testoneclass.juniorjavaactivities;

public class One2 {
	public static void main(String[] args) {
		String[] fruits = new String[] { "Oliver", "Jerial", "Marlon", "Albino" };
		for (String x : fruits) {
			System.out.println(x);
		}
		for (int i = 0; i < fruits.length; i++) {
			String x = fruits[i];
			System.out.println(x +" : "+ i);
			
		}
	}
}
