package Array;

public class ToMergeAnarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]={7,3,4};
		int y[]={14,5,1,9,7};
		int z[]=new int[x.length + y.length];
		for(int i=0;i<x.length; i++)
		{
			z[i]=x[i];
			System.out.println(z[i]);
		}
		for(int i=0;i<y.length; i++)
		{
			z[x.length+i]=y[i];
			System.out.println(z[x.length+i]);
		}
		

	}

}
