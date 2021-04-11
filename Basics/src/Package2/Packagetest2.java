package Package2;
import Package1.ClassA;
//import Package1.ClassE;
//import Package2.ClassB;
import Package1.ClassP;
//import Package2.ClassC;

public class Packagetest2 
	{
    public  static void main(String[] args)
      {

     ClassA objectA= new ClassA(); 
     objectA.displayA(); 
    
      ClassP objectP= new ClassP();      
      objectP.displayP();
      ClassC objectC= new ClassC();      
      objectC.displayC();
      objectC.displayB();
      
      // ClassE objectE= new ClassE();      
      // objectE.displayE();
    

      }


}
