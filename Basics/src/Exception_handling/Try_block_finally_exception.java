package Exception_handling;

public class Try_block_finally_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10+20);
		int a=5;
		int b=0;
		try{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
		System.out.println("denominator can't be zero");
		System.out.println(2+6);
		}
		finally
		{
			System.out.println(2+2);
		}
		System.out.println(10+2);
	}

}
