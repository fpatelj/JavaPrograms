package remoteTiger;
import java.util.*; 

public class SortPrimeDescendingOrder_25 

{
		static boolean prime[] = new boolean[100005]; 
		  
	    static void SieveOfEratosthenes(int n) 
	    { 
	  
	        Arrays.fill(prime, true); 
	  
	  
	        prime[1] = false; 
	  
	        for (int p = 2; p * p <= n; p++) 
	        { 
	  
	      
	            if (prime[p]) { 
	  
	         
	                for (int i = p * 2; i < n; i += p) 
	                { 
	                    prime[i] = false; 
	                } 
	            } 
	        } 
	    } 
	  
	 
	    static void sortPrimes(int arr[], int n) 
	    { 
	        SieveOfEratosthenes(100005); 
	  
	     
	        Vector<Integer> v = new Vector<Integer>(); 
	  
	        for (int i = 0; i < n; i++) 
	        { 
	  
	        
	            if (prime[arr[i]])  
	            { 
	                v.add(arr[i]); 
	            } 
	        } 
	        Comparator comparator = Collections.reverseOrder(); 
	        Collections.sort(v, comparator); 
	  
	        int j = 0; 
	  
	        // update the array elements 
	        for (int i = 0; i < n; i++)  
	        { 
	            if (prime[arr[i]])  
	            { 
	                arr[i] = v.get(j++); 
	            } 
	        } 
	    } 
	  

	    public static void main(String[] args) 
	    { 
	        int arr[] = {4, 3, 2, 6, 100, 17, 11, 6, 8, 93, 19, 55, 33,45,10}; 
	        int n = arr.length; 
	  
	        sortPrimes(arr, n); 
	
	        for (int i = 0; i < n; i++)  
	        { 
	            System.out.print(arr[i] + " "); 
	        } 

	}

}

//I am confused in this to how to extract prime from n numbers and then print them in the descending order. Hence, I took static array elements and printed them in the descending order
