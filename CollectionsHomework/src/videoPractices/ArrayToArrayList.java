package videoPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		/*ArrayList<Integer> myArrayList = new ArrayList<>();
		
		myArrayList.add(10);
		myArrayList.add(20);
		myArrayList.add(30);
		myArrayList.add(40);
		myArrayList.add(50);
		myArrayList.add(60);
		myArrayList.add(70);
		myArrayList.add(80);
		
		
		 for (Integer item: myArrayList) { System.out.println(item); }*/
		 
		List<Integer> myArrayList = Arrays.asList(new Integer[] {10, 20, 30,40, 40, 50 ,60, 70,80});
		 
		/*for(Integer item:myArrayList)
		{
			
			System.out.println(item);
		}*/
		
			//Integer[] myArray = (Integer[]) myArrayList.toArray();
		
		Integer[] myArray = (Integer[]) myArrayList.toArray(new Integer[myArrayList.size()]);

		for(Integer item: myArray)
		{
			System.out.println(item);
		}
		
		
}
}
