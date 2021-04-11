package Array;

public class Merging3arraysintoonearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={4,5,6};
		int b[]={7,8,9,10};
		int c[]={1,2,3,5,7,9};
		int x[]=new int[a.length+b.length+c.length];
		for(int i=0;i<a.length; i++)
		{
			x[i]=a[i];
			System.out.println(x[i]);
		}
		for(int i=0; i<b.length; i++)
		{
			x[a.length + i]=b[i];
			System.out.println(x[a.length+i]);
			
		}
		for(int i=0; i<c.length; i++)
		{
			x[a.length+b.length+i]=c[i];		
		
		System.out.println(x[a.length + b.length+ i]);
		}
	}

}



