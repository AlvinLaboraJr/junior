package testoneclass.opp;

import java.util.List;

public interface Dao {

	public String addStudent(Entities student);
	public List<Entities> viewStudent(Entities id);
}
