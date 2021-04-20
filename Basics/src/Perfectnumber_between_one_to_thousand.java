import java.util.Scanner;

public class Perfectnumber_between_one_to_thousand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int num=1; num <=10000; num++)
		{
			int sum=0;
	     for(int i=1; i<num; i++)
	      {
	    	 if(num % i == 0)
	    	 {
	    		 sum=sum + i ;
	    	 }
	      }
	    if( num == sum)
	     {
	    	 System.out.println(num+" is perfect number ...!");
	     }
	  
}
	}
	
}


