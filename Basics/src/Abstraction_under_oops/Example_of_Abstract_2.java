package Abstraction_under_oops;

public class Example_of_Abstract_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			}
}
		abstract class A2B // purpose of this class is to guide or supervise the child class 
		// all its child class should definitely implement abstract method 
		{
			 void bill()  // transfer property 
			{
				System.out.println("B");

			}
			 
			 abstract void tax() ;   // transfer template 
		}

		class A2BIndia extends A2B
		{
			// implemented method will be inherited to child class 
			// non implemented method needs implementation in child class 
			void tax() // child class enforces the developer to implement the abstract method,
			// this can be called as contract
			{
				System.out.println("5");
			}
		}

		class A2BUS extends A2B
		{
			void tax() 
			{
				System.out.println("15");
			}
		}


		class A2BUK extends A2B
		{
			void tax() 
			{
				System.out.println("10");
			}
		}


	

	

