package remoteTiger;

import java.io.*;


public class ReplaceEmailAddress {
public static void main(String[] args) {
	 
    String str = "This 1231 is 124 a String 1243 to 34563 use 5455";


    String newStr = str.replaceAll("[0-9]+", "");
    System.out.println(newStr);


    newStr = str.replaceAll("[a-zA-Z]+", "Java");
    System.out.println(newStr);
}
}
// Incomplete..I am going to continue to do the one's that are left