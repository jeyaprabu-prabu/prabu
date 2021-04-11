package Array;

public class Mergingof2arraysandremoveitsduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,6,7};
		int b[]={8,9,10,11,2,12,3};
		int x[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length; i++)
		{
			x[i]=a[i];
			x[a.length + i]=b[i];
			
		}
		//System.out.println(x[a.length +i]);
		
		for(int i=0; i<x.length; i++)
		{
			for(int j=i+1; j<x.length; j++)
			{
			if(x[i] == x[j])
			{
				x[j]=0;
			}
		}
			System.out.println(x[i]);
		}
		
		

	}
	}


