package Array;

public class SplitArrayonbasisofoddAndEvennos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,3,7,6,2,7};
		int x[]=new int[a.length];
		int y[]=new int[a.length];	
		
		if(a.length % 2 ==0)
		{
			//int x[]=new int[a.length/2];
			//int y[]=new int[a.length/2];
			for(int i=0; i<a.length; i++)
			{
		    if(a[i] % 2 == 0)
			{
				x[i]=a[i];
				System.out.println("evennumber--(x)"+x[i]+"");
							
			}
			else
			{
				y[i]=a[i];
				System.out.println("oddnumber--(y)"+y[i]+"");
			}
		   // System.out.println("evennumber--"+x[i]+"");
		   // System.out.println("oddnumber--"+y[i]+"");
			}
		}
		else
		{
			//int x[]=new int[a.length/2];
			//int y[]=new int[a.length/2];
			for(int i=0; i<a.length; i++)
			{
			if(a[i] % 2 == 0)
			{
				x[i]=a[i];
				System.out.println("evennumber(x)"+x[i]+"");
							
			}
			else
			{
				y[i]=a[i];
				System.out.println("oddnumber(y)"+y[i]+"");
			}
			
			System.out.println(x[i]);
			System.out.println(y[i]);
		}
	

		}


}
}

