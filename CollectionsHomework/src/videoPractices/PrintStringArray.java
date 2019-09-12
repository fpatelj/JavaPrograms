package videoPractices;
import java.util.*;

public class PrintStringArray 
{
public static void main (String[] args) throws java.lang.Exception{  
   
    String[] inputArray = {"One","Two","Three","Four", "Five"}; 
    System.out.println("Array : " + Arrays.toString(inputArray));  
    reverseArray(inputArray);
}
public static void reverseArray(String[] arr) {

    List<String> list = Arrays.asList(arr);

    Collections.reverse(list);

    String[] reversedArray = list.toArray(arr);

    System.out.print("Reversed Array : " + Arrays.toString(reversedArray));
}
}