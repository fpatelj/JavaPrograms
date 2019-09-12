package videoPractices;

import java.util.ArrayList;

public class Application1 {

	public static void main(String[] args) {
		int x = 21;
		Integer x1 = 21;
		
		ArrayList<Integer> IntegerList = new ArrayList<>();
		IntegerList.add(new Integer(20));
		IntegerList.add(56);
		
		IntegerList.forEach(i->System.out.println(i));//lamda Expression
		
		IntegerList.forEach(System.out::println);//lamdaa Expression

	}

}
