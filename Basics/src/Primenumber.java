
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
			  int m=0,flag=0;      
			  int n=3;//it is the number to be checked    
			  m=n/2;      
			  if(n==0||n==1)
			  {  
			   System.out.println(n+" is a non-prime number");      
			  }
			  else
			  {  
			   for(int i=2;i<=m;i++)
			    {      
				   	if(n%i==0)
				   	{      
					System.out.println(n+" is a non-prime number");      
					flag=1;      
					break;      
			         }      
			   }
			   
			   
			   
			   if(flag==0)  
			   { System.out.println(n+" is a prime number"); }  
			  }//end of else  
			}    
}   

	


