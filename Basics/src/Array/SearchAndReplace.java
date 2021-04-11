package Array;

public class SearchAndReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,2,4,5,6};
		int search=5;
		int replace=15;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==search)
			{
				a[i]=replace;
			
		
		System.out.println(a[i]);
		}
		}
	}
}


	


