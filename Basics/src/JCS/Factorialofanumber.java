package JCS;

public class Factorialofanumber {
	void m(int i)
	{
		System.out.println (i);
		;
		if(i <= 5)
		{
			m(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorialofanumber a=new Factorialofanumber();
		a.m(1);
	}


}
