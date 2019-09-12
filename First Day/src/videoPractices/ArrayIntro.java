package videoPractices;

public class ArrayIntro {

	public static void main(String[] args) {
		int[] ourArray = new int[] { 1, 2, 3, 4, 5, 6 };

		int[] ourArray1 = new int[5];
		ourArray1[0] = 4;
		ourArray1[1] = 8;
		ourArray1[2] = 8;
		ourArray1[3] = 8;
		ourArray1[4] = 8;

		for (int i = 0; i < ourArray1.length; i++) {
			System.out.println(ourArray1[i]);
		}

		for (int item : ourArray) {
			System.out.println(item);
		}

		int i =97;
		double d = 26.0;
		System.out.println(i==d);//the comparator operator compares the value 
		                         //always returns the output in true/false format
		                         // Hence, the value assigned to i and d is 97 even if
		                         //datatype is different
		
		
		char c = 'z';
		System.out.println(d==c);
		System.out.println(i==c);//This will give false because the double and char
	}                             //cannot be compared in terms of format

}
