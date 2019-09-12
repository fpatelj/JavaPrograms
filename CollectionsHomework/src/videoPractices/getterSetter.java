package videoPractices;

import java.util.Random;

public class getterSetter {

	private int id;
	private String name;

	public getterSetter(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	public getterSetter(String name) {
		super();
		this.id = new Random().nextInt();
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public getterSetter() {
	
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


	public static void main(String[] args) {
		
		  getterSetter getSet = new getterSetter(); 
		  getSet.setId(1001);
		  getSet.setName("Feral Patel");
		 
		
		//getterSetter getSet = new getterSetter(1005, "John smith"); 
		
		
		int testId = getSet.getId()+100;
		getSet.setId(testId);
		
		
		
		
		System.out.println(getSet.getName());

	}

}
