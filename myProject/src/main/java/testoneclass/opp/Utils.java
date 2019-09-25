package testoneclass.opp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Utils {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static Dao studentDao = new Service();

	public static String addStudent() throws IOException {
		Entities student = new Entities();
		System.out.println("enter name: ");
		String name = br.readLine();
		student.setName(name);

		System.out.println("enter project: ");
		String pj = br.readLine();
		student.setProject(pj);
		
		System.out.println("enter id");
		int id = br.read();
		student.setId(id);
		System.out.println("your id : "+student.getId());
		studentDao.addStudent(student);
		return "success";
	}

	public static String viewStudent() throws IOException {
		Entities student = new Entities();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		student.setId(id);
		student.setName(student.getName());
		student.setProject(student.getProject());
		student.getId();
		studentDao.viewStudent(student);
		System.out.println(student);

		return "Viewed";
	}
}
