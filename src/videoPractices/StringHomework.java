package videoPractices;

public class StringHomework {

	public static void main(String[] args) {

		String testString1 = "The brown jumps";
		String testString2 = "The quick brown fox jumps";

	}

	public static String stringDiff(String testString1, String testString2) {
		int index = testString1.lastIndexOf(testString2);
		if (index > -1) {
			return testString1.substring(testString2.length());
		}
		return testString1;
	}

}

/*
 * public static String stringDiff(String testString1, String testString2) {
 * 
 * if (testString1 == null) { return testString2; } if (testString2 == null) {
 * return testString1; }
 * 
 * int x = indexOfDifference(testString1, testString2); if (x == -1) { return
 * ""; }
 * 
 * return testString2.substring(x);
 * 
 * }
 * 
 * public static int indexOfDifference(String testString1, String testString2) {
 * if (testString1 == testString2) { return -1; } if (testString1 == null ||
 * testString2 == null) { return 0; }
 * 
 * int i; for (i = 0; i < testString1.length() && i < testString2.length(); ++i)
 * { if (testString1.charAt(i) != testString2.charAt(i)) { break; } } if (i <
 * testString2.length() || i < testString1.length()) { return i; } return -1; }
 * 
 * }
 */

/*
 * if (testString1.length() > testString2.length()) { return
 * testString1.substring(testString1.length() - 1); } else if
 * (testString2.length() > testString1.length()) { return
 * testString2.substring(testString1.length() - 1); } else { return ""; }
 */