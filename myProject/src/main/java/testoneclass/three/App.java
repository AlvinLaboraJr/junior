package testoneclass.three;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class NHuman {
	private String name;
	private String subject;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "NHuman [name=" + name + ", subject=" + subject + ", id=" + id + "]";
	}

}

public class App {
	private static final AtomicInteger count = new AtomicInteger(0);

	public void add() {
		Scanner sc = new Scanner(System.in);
		ArrayList<NHuman> list = new ArrayList<NHuman>();
		NHuman nH = new NHuman();
		String name;
		String subject;
		int id = count.incrementAndGet();

		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("Enter subject: ");
		subject = sc.nextLine();

		nH.setName(name);
		nH.setSubject(subject);
		nH.setId(id);
		list.add(nH);
		for (NHuman nHuman : list) {
			System.out.println(nHuman);
		}
		System.out.println();
	}

	public void view() {
		ArrayList<NHuman> ls = new ArrayList<NHuman>();
		App sp = new App();
		NHuman sl = new NHuman();
		sl.getName();
		sl.getSubject();
		sl.getId();
		for (NHuman nHuman : ls) {
			nHuman.getName();
			nHuman.getSubject();
			nHuman.getId();
			System.out.println(nHuman);
		}
		
	}

	public void main() {
		Scanner sc = new Scanner(System.in);
		App app = new App();
		int nm;
		do {
			System.out.println("1: ADD");
			System.out.println("2: VIEW");
			nm = sc.nextInt();
		} while (nm == 0);
		if (nm == 1) {
			app.add();
			app.main();
		} else if (nm == 2) {
			app.view();
			app.main();
		}
	}
	public static void main(String[] args) {
		App app = new App();
		app.main();

	}
}
