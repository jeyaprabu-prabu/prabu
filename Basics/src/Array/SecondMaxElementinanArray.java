package Array;

public class SecondMaxElementinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={19,12,8,9,6,5,4};
		int max1 =0, max2 =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
				
		     }
			else
			{
				if(a[i]>max2)
				{
				   max2=a[i];
				}
			}
		}
			System.out.println(max2);
			System.out.println(max1);
		
		

	}
}
