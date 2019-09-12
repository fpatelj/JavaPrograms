package remoteTiger;
import java.util.Random;


public class SumOfPrimeNumbers_09

{
	public static void main(String[] args) 
	{
		Random rd = new Random(); 
		     int[] arr = new int[100];
		     int sum=0;
		     for (int i = 0; i < arr.length; i++) 
		     {
		        arr[i] = rd.nextInt(); 
		     }
		     for (int i = 0; i < arr.length; i++) 
		     {
		   	 boolean isPrime = true;
		   	 int j=Math.abs(arr[i]);
		   	 for (int k=2; k<j; k++)
		   	 {

		             if(i%k==0){
		                 isPrime = false;
		                 break;
		             }
		             if(isPrime)
		           	 sum = sum+arr[i];
		     }
		     
		}
		     System.out.println(sum);
	}
}
