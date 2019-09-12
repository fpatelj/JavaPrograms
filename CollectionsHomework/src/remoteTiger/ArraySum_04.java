package remoteTiger;

public class ArraySum_04 
{
	
	 static int array[] = {12,13,14,18}; 
     
      
     static int sum() 
     { 
         int sum = 0; 
         int x; 
 
         for (x = 0; x < array.length; x++) 
            sum +=  array[x]; 
        
         return sum; 
     } 
       
	public static void main(String[] args)
	{
		System.out.println("Ths sum of the array is:" + sum()); 
	}
}
