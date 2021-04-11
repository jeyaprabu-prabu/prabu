package Array;

public class Secondminimuminanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,1,9,5,11,4,6,7,5};
		int min1=a[1],min2=a[0];
		for(int i=0;i<a.length; i++)
		{
			if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else
			{
				if(a[i]<min2)
				{
					min2=a[i];
					
				}
			}
		}
			System.out.println(min2);
			System.out.println(min1);
		}

	}


