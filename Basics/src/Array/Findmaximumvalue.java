package Array;

public class Findmaximumvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,2,4,5,6,30};
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
