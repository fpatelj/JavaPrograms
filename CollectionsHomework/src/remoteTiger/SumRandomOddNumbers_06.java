package remoteTiger;
import java.util.Random;

public class SumRandomOddNumbers_06 {

	public static void main(String[] args)
	{
		 Random rd = new Random(); 
	     int[] arr = new int[100];
	     int sum=0;
	     for (int i = 0; i < arr.length; i++) {
	        arr[i] = rd.nextInt(); 
	       
	     }
	     for (int i = 0; i < arr.length; i++) {
	   	 if(arr[i] %2 ==1)
	   	 sum=   sum + arr[i];
	     }
	     System.out.println(sum);
	}

	}

