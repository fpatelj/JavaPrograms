package videoPractices;

import java.io.Serializable;

public class Course implements Cloneable, Serializable, Comparable<Course>

{

	private int id;

	public Course(int id) 
	{
		super();
	this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + "]";
	}

	@Override
	public int compareTo(Course o) {
		
		return this.id - o.getId();
	}
	
	/*
	 * @Override public int compareTo(Course o) {
	 * 
	 * return this.id.compareTo(o.getId()); }
	 */
	

}
