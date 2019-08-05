package remoteTiger;

public class GCD_14 
{

	public static void main(String[] args) 
	{
		int num1 = 9, num2 = 18, gcd = 1;
        for(int i = 1; i <= num1 && i <= num2; ++i)
        {
           
            if(num1 % i==0 && num2 % i==0)
                gcd = i;
        }
        
    System.out.printf("The G.C.D of the number's %d and %d is %d", num1, num2, gcd);
    
	}

}
