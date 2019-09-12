package remoteTiger;

public class ReverseNumber_19 
{

	public static void main(String[] args)
	
	{
		int num = 3232, reverse = 0;
        while(num != 0)
    {
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num /= 10;
    }
    System.out.println("The reversed Number is: " + reverse);
  }
		
}
