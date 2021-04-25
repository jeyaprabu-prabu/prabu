package Abstraction_under_oops;

public class example_of_abstract_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(); // what is the use of this class ?
          b.m();
          b.n();
			}
		}
		// Abstraction - process of hiding method ( its also known as method hiding )
		// Keyword used for abstraction is "abstract"

		abstract class A // abstract class / partially implemented class 
		{
			abstract void m() ; // abstract method or non implemented method 
			
			void n() // non abstract method or implemented method 
			{
				System.out.println("N");
			}
			
		}


		class B extends A
		{
			void m() // implementation is provided in child class for abstract method m()
			{
				System.out.println("B");
			}
		}

	


