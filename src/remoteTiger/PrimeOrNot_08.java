package remoteTiger;

public class PrimeOrNot_08 {

	public static void main(String[] args) 
	{
		int b=0, c=0;
		{
			int num=6;
			b = num/2;
			if(num==0 || num==1)
			{
				System.out.println(num + " is not a prime number");
			}
			else
			{
				for(int a=2; a<=b;a++)
				{
					if(num%a==0)
					{
						System.out.println(num + " is not prime number");
						c=1;
						break;
					}
				}
				if(c==0)
				{
					System.out.println(num + " is a prime number");
				}
			}
		}

	}

}
