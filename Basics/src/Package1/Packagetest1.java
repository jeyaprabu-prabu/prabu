package Package1;

//import Package1.ClassA;
//import Package1.ClassE;
//import Package2.ClassC;
import Package2.ClassB;

public class Packagetest1
{
	 public static void main(String args[])
	 {
		 ClassA objectA = new ClassA();
		   objectA.displayA();
		   ClassP objectP = new ClassP();
		   objectP.displayP();
		   ClassB objectB = new ClassB();
		   objectB.displayB();
		  // ClassC objectC = new ClassC();//bcoz extends in the classc
		  // objectC.displayC();u cannot view bcoz ClassC not shown bcoz of inheritance
		  ClassE objectE = new ClassE();
		   objectE.displayE();
		   
	 }

}