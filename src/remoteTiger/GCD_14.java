package remoteTiger;

import java.util.Scanner;

public class GCD_14 
{
	
		
		public static int findGCD(int x, int y ,int z) 
		{
			if(z==0)
			{
				return x;
			}
			else if(y==0)
			{
				return x;
			}
			return findGCD(x ,y, z%y%x);
		}
		
		
public static void main(String[] args)
{
	int x= 45;
	int y= 15;
	int z = 105;
	
	System.out.println("The GCD of three numbers is:" +findGCD(x, y, z%y%x));
	
}

}