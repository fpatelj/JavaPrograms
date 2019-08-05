package remoteTiger;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;



public class SumArrayRandom_05 
{
	public static void main(String[] args) {
		Random rd = new Random(); 
		     int[] arr = new int[100];
		     int sum=0;
		     for (int i = 0; i < arr.length; i++) {
		        arr[i] = rd.nextInt(); 
		     }
		     for (int i = 0; i < arr.length; i++) {
		   	 sum = sum +arr[i] ;
		     }
		     System.out.println(sum);
		}
}