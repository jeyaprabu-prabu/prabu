package Array;

public class Findminimumvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,2,4,5,6,1};
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
