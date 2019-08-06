package remoteTiger;
import java.util.Scanner;


public class LCM_15 
{

	public static int lcm(int num1, int num2) {
        int x,max=0,min=0,lcm=0;
        if(num1>num2)
        {
            max=num1;
            min=num2;
        }
        else
        {
            max=num2;
            min=num1;
        }
          
     
        for(int i=1;i<=min;i++)
        {
         x=max*i; 
         if(x%min==0) 
          {
           lcm=x; 
           break; 
          }
         }
      return lcm;
 }
	public static void main(String[] args) {
	      
        Scanner sc=new Scanner(System.in);
 
        System.out.print("Num1  :");
        int num1=sc.nextInt();
        System.out.print("Num2 :");
        int num2=sc.nextInt();
 
        System.out.println("Lowest Common Factor: " + lcm(num1,num2));
       
    }
}
