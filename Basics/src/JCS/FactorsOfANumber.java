package JCS;

public class FactorsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=48;
		for(int i=1; i<=num; i++)
		{
			if(num % i==0)
			{
				System.out.println(i);
			}
		}

	}

}
