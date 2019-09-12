package remoteTiger;
import java.util.*;

public class Palindrome_24 
{

	public static void main(String[] args)
	
	{
		
		String enter, check = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string to check:");
        enter = s.nextLine();
        int n = enter.length();
        for(int i = n - 1; i >= 0; i--)
        {
            check = check + enter.charAt(i);
        }
        if(enter.equalsIgnoreCase(check))
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
	}

}
