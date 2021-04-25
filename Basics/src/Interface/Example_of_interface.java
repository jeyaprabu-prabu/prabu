package Interface;

public class Example_of_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//if all the methods are abstract then its said to be an interface 
//100% abstraction 
//completely opp to class coz class is 0% abstraction
//class should have only implemented methods 
//interface should have only non implemented methods 
//abstract class can have both
//interface is a keyword 
interface I 
{
public void m();
public void n();
public void p();	
}
class J implements I
{
	public void m()
	{	
	}
	public void n()
	{
	}
	public void p()
	{
	}
}
class K implements I
{
	public void m()
	{	
	}
	public void n()
	{
	}
	public void p()
	{
	}
}