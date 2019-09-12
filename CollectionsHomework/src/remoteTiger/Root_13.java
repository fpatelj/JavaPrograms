package remoteTiger;

public class Root_13 
{
  public static void main(String[] args)
  {
	  int num = 4;
      double i, decimal = 0.00001;
      for(i = 1; i*i <=num; ++i);
      for(--i; i*i < num; i += decimal);
      System.out.println("Root of " + num + " is " +i);
   }
}
