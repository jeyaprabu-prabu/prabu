package Array;

public class SumofallelementsEqualtoSumofoddandeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,2,4,7,6,8,9};
		int evensum=0, oddsum=0,allsum=0,z=0;
		//boolean flag=false;
		for(int i=0; i<a.length; i++)
		{
			if(a[i] % 2 == 0)
			{
				evensum=evensum+a[i];				
			}
			else
			{
				oddsum=oddsum+a[i];				
			}
		}
			    System.out.println("evensum="+evensum);
			    System.out.println("oddsum="+oddsum);
			       z=evensum+oddsum;
				System.out.println("evenandoddsum="+z);			
		
		     
		for(int i=0; i<a.length; i++)
			{
				allsum=allsum+a[i];
			}
				System.out.println("allsum"+allsum);
					   
			   
		     if(allsum == z)
		     {
		    	 //flag=true;
		    	 System.out.println("sum of all elements equal to sum of odd and even elements.the value is"+allsum);
		     }
			
		
			
			}
				
		
		

	}


