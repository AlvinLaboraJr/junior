package testoneclass.opp;

public class Entities {

	private String name;
	private String project;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student:  [name=" + name + ", project=" + project + ", id=" + id + "]";
	}
	
	
}
