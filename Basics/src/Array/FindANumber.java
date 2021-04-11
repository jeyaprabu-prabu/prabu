package Array;

public class FindANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,2,4,5,6,0,8};
		int search=5;
		boolean flag =false;
		for(int i=0;i<a.length; i++)
		{
			if(a[i]==search)
			{
				flag=true;
			}
		}
			
		
		System.out.println(flag);
		}

	}



