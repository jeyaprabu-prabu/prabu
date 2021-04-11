package Package2;
import Package1.ClassA;
import Package1.ClassP;
//import Package1.ClassE;
//import Package2.ClassB;


 class  ClassC extends ClassB
 { 
	  int n=20;
	protected void displayC()
	 {
		 System.out.println("Class C");
		 System.out.println("m==" + m);
		 System.out.println("n ==" + n);
		 
	 }
 }
	   class Packagetest3
	 {
		 
	 public static void  main(String[] args)
	 {
		// TODO Auto-generated method stub
		 ClassA objectA=new ClassA();
		 objectA.displayA();
		 ClassC objectC = new ClassC();
		 objectC.displayB();
		 objectC.displayC();
		 ClassP objectP=new ClassP();
		 objectP.displayP();
		
		//ClassE objectE=new ClassE();
		//objectE.displayE();
		 

	}

}
 
