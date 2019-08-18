package collectionsHomework;

public class Student {

	private String lastName;
	private String firstName;
	private String email;
	private int id;
	private String phoneNumber;
	private String departmentName;
	
	public Student(String lastName, String firstName, String email, int id, String phoneNumber, String departmentName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.departmentName = departmentName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
	
}
