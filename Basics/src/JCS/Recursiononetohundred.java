package JCS;

public class Recursiononetohundred {
	void m(int i)
	{
		System.out.println (i);
		i ++;
		if(i <= 100)
		{
			m(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recursiononetohundred a=new Recursiononetohundred();
		a.m(1);
	}

}
