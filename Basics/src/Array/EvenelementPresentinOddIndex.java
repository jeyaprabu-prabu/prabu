package Array;

public class EvenelementPresentinOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={5,2,4,5,7,8,9};
		for(int i=1; i<a.length; i=i+2)
		{
			if(a[i] % 2 == 0)
			{
				System.out.println(a[i]);
			}
		
		}

	}

}
