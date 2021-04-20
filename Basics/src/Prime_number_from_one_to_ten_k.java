import java.util.Scanner;

public class Prime_number_from_one_to_ten_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		    
	     
	   for(int num=1;num<=10000;num++)
	     {
		   int count=0;
	     for(int j=1;j<=num;j++)
	      {
	    	 if(num % j == 0)
	    	 {
	    		 count=count+1; 			 
	          }
	      }
	     
	    
	     if(count == 2)
	     {
	    	 System.out.println(num);
	     }
	   }
	     }
	
}


