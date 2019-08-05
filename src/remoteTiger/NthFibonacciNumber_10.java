package remoteTiger;

 class NthFibonacciNumber_10 

{
	 static int fibonacci(int num)
	 {
		 if(num<=1)
		
			   return num;
			 return fibonacci(num-1) + fibonacci(num-2);
	 }
	
 public static void main(String args[]) 
 {
	 int num= 10;
	 System.out.println(fibonacci(num));

}
}
