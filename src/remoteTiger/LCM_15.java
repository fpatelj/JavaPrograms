package remoteTiger;

public class LCM_15 
{

	public static void main(String[] args)
	{
		int num1 = 12, num2 = 6, lcm;
       
        lcm = (num1 > num2) ? num1 : num2;
        
        while(true)
        {
            if( lcm % num1 == 0 && lcm % num2 == 0 )
            {
                System.out.printf("The LCM of %d and %d is %d.", num1, num2, lcm);
                break;
            }
            ++lcm;
        }
	}
}
