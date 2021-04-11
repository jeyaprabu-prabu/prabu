package Forloop;

public class AintersectionB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={7,3,4,1,5};
		int b[]={15,11,3,19,1};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					
				}
			}
		}

	}

}
