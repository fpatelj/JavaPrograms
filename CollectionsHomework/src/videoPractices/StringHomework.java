package videoPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringHomework {

	
		public static void main(String[] args) {
	        String s = "The fox jumped out of the barn";
	        String t = "fox jumped out barn";

	        String[] arr = missingWords(s, t);
	        for (String str : arr) {
	            System.out.println(str);
	        }
	    }

	    static String[] missingWords(String s, String t) {
	        List<String> words = new ArrayList<>();

	        String[] tTokens = t.split(" ");
	        String[] sTokens = s.split(" ");

	        System.out.println("sTokens = " + Arrays.asList(sTokens));
	        System.out.println("tTokens = " + Arrays.asList(tTokens));

	        for (int i = 0, j = 0; i < sTokens.length; i++) {
	            if (!sTokens[i].trim().equals(tTokens[j].trim())) {
	                words.add(sTokens[i]);
	            } else {
	                if (j >= tTokens.length - 1) {
	                    continue;
	                } else {
	                    j++;
	                }
	            }
	        }

	        return words.toArray(new String[0]);
	    }
}