package Array;

public class Merging3arrayswithAscendingandDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,2,1};
		int b[]={4,5,6};
		int c[]={9,8,7};
		int x[]=new int[a.length+b.length+c.length];
		System.out.println("Merging three arrays into one");
		for(int i=0; i<a.length; i++)
		{
			x[i]=a[i];
			System.out.println(x[i]);
		}
		for(int i=0; i<b.length; i++)
		{
			x[a.length+i]=b[i];
		   System.out.println(x[a.length+i]);
		}
		for(int i=0; i<c.length; i++)
		{
			x[a.length+b.length+i]=c[i];		
		   System.out.println(x[a.length+b.length+i]);
		}
			int temp=0;//ascending order
			System.out.println("ascending order");
		for(int i=0; i<x.length;i++)
		{
			for(int j=i+1; j<x.length; j++)
			{
				if(x[i] > x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		
			System.out.println(x[i]);
			
		} 
		int temp1=0;//descending order
		System.out.println("descending order");
		for(int i=0; i<x.length;i++)
		{
			for(int j=i+1; j<x.length; j++)
			{
				if(x[i] < x[j])
				{
					temp1=x[i];
					x[i]=x[j];
					x[j]=temp1;
				}
			}
		
			System.out.println(x[i]+"");
			
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
}
}

	


