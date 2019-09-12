package remoteTiger;
import java.util.Scanner;


public class LCM_15 
{

	static int findGCD(int x, int y)
	{
		if(x==0)
			return y;
		return findGCD(y%x, x);
	}
	static int findLcmWithGCD(int x, int y)
	{
		return (x*y)/findGCD(x,y);
	}
	public static void main(String[] args)
	{
		int x= 15, y=30;
		System.out.println("The LCM is: " + findLcmWithGCD(x,y));
	}
}