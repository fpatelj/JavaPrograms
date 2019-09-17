package remoteTiger;


import java.util.stream.LongStream;
import static java.lang.Math.log;

public class NaturalNumberProblem 
{
   public static String compress(String t,int k)
   {
	   if(t==null || t.isEmpty() || k<2)
	   {
		   throw new IllegalArgumentException();
	   }
	   return t;
   }
   
   static final double lnOf3 = log(3);
   static final double lnOf5 = log(5);
   static final double logOfBase3 = lnOf5/lnOf3;;
   
	public static void main(String[] args) {
		
		double tolerence = 0.001;
		long given = 125;
		 double LnOfGiven = log(given);
		 double logOfGivenBase3  = LnOfGiven/lnOf3;
		 
		 System.out.println(Math.floor(logOfGivenBase3 / Math.ceil(logOfGivenBase3)));
		 
		 if(Math.floor(logOfGivenBase3) / Math.ceil(logOfGivenBase3)<tolerence) {
			 System.out.println(true);
		 }
		 
		 double logOfGivenBase5  = LnOfGiven / lnOf5;
		 if(Math.floor(logOfGivenBase5) / Math.ceil(logOfGivenBase5) < tolerence)
		 {
			 System.out.println(true);
			 
		 }
		 
		 for(long x = 0; x<=(long)logOfGivenBase3; x++)
		 {
			 double factor = (logOfGivenBase3 - x )/ logOfGivenBase3;
			 System.out.println(factor);
			 if(factor < 0)
			 {
				  System.out.println(false);
				  break;
			 }
			 
			 if(Math.floor(factor ) == Math.ceil(factor)) {
				 System.out.println(true);
			 }
		 }
		 
	}

	/*public static boolean isNaturalNumber(long givenNumber)
	{
		if(givenNumber == 1 || givenNumber == 3 || givenNumber == 5)
		{
			return true;
		}
		for(long y =0 ; y<=(long)Math.sqrt(givenNumber); y++)
		{
			double powerOf5 = Math.pow(5, y);
			if(powerOf5 > givenNumber)
			{
				return false;
			}
			
			double remainderFactorFor3 = givenNumber / powerOf5;
			
			
			if(Math.floor(remainderFactorFor3) == Math.ceil(remainderFactorFor3))
			{
				for(long x = 0; x<= (long) Math.sqrt(remainderFactorFor3); x++) {
					double powerOf3 = Math.pow(3, y);
				}
			}*/
			
	
}
