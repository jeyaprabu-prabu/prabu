package Package1;
//import Package1.ClassA;
//import Package1.ClassP;
import Package2.ClassB;
//import Package2.ClassC;

  class  ClassE extends ClassA
{ 
	 public int n=20;
     public void displayE()
	 {
		 System.out.println("Class E");
		// System.out.println("m==" + m);
		 System.out.println("n ==" + n);
		 
	 }
}
public  class Packagetest4
	 {
		 
	 public static void  main(String[] args)
	 {
		// TODO Auto-generated method stub
		// ClassA objectA=new ClassA();
		// objectA.displayA();
		 ClassP objectP=new ClassP();
		 objectP.displayP();
		 ClassE objectE = new ClassE();
		 objectE.displayE();
		 objectE.displayA();
		 ClassB objectB=new ClassB();
		 objectB.displayB();
		// ClassC objectC=new ClassC();
		// objectC.displayC();
		 
		 

	}

}
