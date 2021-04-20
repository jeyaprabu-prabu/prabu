import java.util.Scanner;

public class Prime_number_programme_easy_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no to be checked::>");
     int num=sc.nextInt();
     sc.close();
     int count=0;
     for(int i=1;i<=num;i++)
      {
    	 if(num % i ==0)
    	 {
    		 count=count+1;
    	 }
     }
     if(count == 2)
     {
    	 System.out.println("given no is prime number ...!");
     }else{
    	 System.out.println("given no is NON-prime number ...!");
     }
    	 
     
	}

}
