package org.learn.javacollection;

public class Employee implements Comparable<Employee>{

	private Integer id;
	private String name;

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	

	@Override
	public int hashCode() {
		//System.out.println("Hashcode*** method got called from employee class");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * @Override public boolean equals(Object obj) {
	 * 
	 * //System.out.println("Equals method got called from employee class"); if
	 * (this == obj) return true; if (obj == null) return false; if (getClass() !=
	 * obj.getClass()) return false; Employee other = (Employee) obj; if (id ==
	 * null) { if (other.id != null) return false; } else if (!id.equals(other.id))
	 * return false; if (name == null) { if (other.name != null) return false; }
	 * else if (!name.equals(other.name)) return false; return true; }
	 */
	@Override
	public int compareTo(Employee o) {
		//System.out.println("CompareTo ---- method got called from employee class");
		return this.id.compareTo(o.getId()) == 0 ? 
				this.name.compareTo(o.getName()): 
					this.id.compareTo(o.getId()); //Ternery Operator
		
	}

}
