package videoPractices;

public class Student implements Cloneable{
	
	private int id;
	
	public Student(int id) {
		super();
		this.id = id;
	}
	

public int getId()
{
	return id;
}

public void setId(int id)
{
	this.id = id;
}

public void setId(String id)
{
	this.id = Integer.parseInt(id); // method overloading- compile time polymorphism - static binding
}

public String toString()
{
	return "Student [id=" + id + "]";
}


}
