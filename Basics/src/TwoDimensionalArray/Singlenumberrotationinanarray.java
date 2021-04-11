package TwoDimensionalArray;

public class Singlenumberrotationinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={9,4,11,13,1,7,5,4};
		int temp=a[0];
		
		for (int i=0;i<a.length-1 ;i++)
		{
			a[i]=a[i+1];
			
		}
		a[a.length - 1]= temp;
		for(int i=0;1<a.length; i++)
		{
		System.out.println(a[i]);
		}
		

	}

}
