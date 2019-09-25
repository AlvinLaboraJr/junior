package testoneclass.opp;

import java.util.List;

public class Service implements Dao {

	public String addStudent(Entities student) {
		System.out.println("student added.");
		return "success";
	}

	public List<Entities> viewStudent(Entities student) {
		
		return null;
	}

}
