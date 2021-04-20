package Exception_handling;

public class try_block_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(20+20);
		try{
			System.out.println(1/1);

		
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);

			System.out.println(2+2);

	    }
		finally
		{
			System.out.println(1+2);
		}
		System.out.println(10+10);

}	
}