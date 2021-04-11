package Array;

public class SplitOnearrayintoThreearrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={7,5,4,3,1,11,13,8,9,7,5};
		if(a.length % 3 == 0)
		{
			int x[]=new int[a.length/3];
			int y[]=new int[a.length/3];
			int z[]=new int[a.length/3];
			for(int i=0; i<x.length; i++)
			{
				x[i]=a[i];
				System.out.println("x"+x[i]+"");
			}
			for(int i=0; i<y.length; i++)
			{			
				y[i]=a[x.length+i];
				System.out.println("y"+y[i]+"");
			}
			for(int i=0; i<z.length; i++)
			{
				z[i]=a[x.length+y.length+i];
				System.out.println("z"+z[i]+"");
								
			}
		}
		
		
		else
		{
			//int rem=(a.length / 3);
			int x[]=new int[a.length/3 +1];
			int y[]=new int[a.length/3 +1];
			int z[]=new int[a.length/3];
			for(int i=0; i<x.length; i++)
			{
				x[i]=a[i];
				System.out.println("x"+x[i]+"");
			}
			for(int i=0;i<y.length; i++)
			{
				y[i]=a[x.length+i];
				System.out.println("y"+y[i]+"");
			}
			for(int i=0;i<z.length; i++)
			{
				z[i]=a[x.length+y.length+i];
				System.out.println("z"+z[i]+"");
			}
			
		
				
		}
			
		}
	}





	


