package Array;

public class ToSplitanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={7,5,4,3,1,11,13,0,9,7,6};
		if(a.length % 2 != 0)
		{
			int x[]= new int [a.length/2 +1];
			int y[]= new int [a.length/2];
			for(int i=0; i<x.length; i++)
			{
				x[i]=a[i];
				System.out.println(x[i]);
				
			}
			for(int i=0; i<y.length; i++)
			{
				y[i]=a[x.length+i];
				System.out.println(y[i]);
			}
		}
			
			else
			{
				int x[]=new int[a.length/2];
				int y[]=new int[a.length/2];
				for(int i=0;i<x.length; i++)
				{
					x[i]=a[i];
					y[i]=a[x.length+i];					
				
				System.out.println(x[i]+"_"+y[i]);
				//System.out.println(y[i]);
			    }
		    }
		}
			
		

	}


