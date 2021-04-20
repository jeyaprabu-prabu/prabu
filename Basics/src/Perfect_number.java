import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number to be checked::>");
	     int num=sc.nextInt();
	     sc.close();
		
	     int sum=0;
	     for(int i=1;i<num;i++)
	      {
	    	 if(num % i ==0)
	    	 {
	    		 sum=sum+i;
	    	 }
	      }
	     
	     if(num == sum)
	     {
	    	 System.out.println("given no is perfect number ...!");
	     }
	     else
	     {
	    	 System.out.println("given no is imperfect number ...!");
	     }
	    	 

	}
	

}
