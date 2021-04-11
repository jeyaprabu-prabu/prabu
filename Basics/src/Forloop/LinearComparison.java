package Forloop;

public class LinearComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={9,7,1,4,5,3,11};
		for(int i=0; i<a.length; i++)
		{
			 for(int j=i+1; j<a.length; j++)
			 {
				 System.out.println(a[i]+" "+a[j]);
			 }
		}

	}

}
