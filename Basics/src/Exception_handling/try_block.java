package Exception_handling;

public class try_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=0;
		try{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
		System.out.println("denominator can't be zero");
			
		
		}

	}

}
