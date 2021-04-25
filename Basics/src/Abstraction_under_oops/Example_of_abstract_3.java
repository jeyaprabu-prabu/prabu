package Abstraction_under_oops;

public class Example_of_abstract_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class X  // parent class being abstract class 
{
	abstract void tamil();
	void telugu()
	{
		
	}
}
abstract class Y extends X  // child class being abstract class 
{
	abstract void english();
}
class Z extends Y
{
	void tamil()
	{
		
	}
	void english()
	{
		
	}
}