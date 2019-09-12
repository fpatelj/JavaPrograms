package videoPractices;

public class PrintNumberArray {

	public static void main(String[] args) {
		
    int newArray[] ;
    newArray = new int[5];
    
	
    newArray[0] = 1;
    newArray[1] = 2;
    newArray[2] = 3;
    newArray[3] = 4;
    newArray[4] = 5;
    //newArray[5] = 5;
   
    
    for(int i=0; i<newArray.length; i=i+2)
    {
    	
    	/*if(newArray[i+1]%2 == 0)
    	{*/
    	System.out.println(newArray[i]);
    //}
    
	}
	
	}
	
}
