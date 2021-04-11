
public class Factorialrecursion {
	static int fact=1;
	static void m(int i)
       {
		fact=fact*i;
		System.out.println(fact);
		
		i++;
	
	   if(i <= 5)
	  {
		m(i);
	  }     
	   
	
     }


public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
	m(1);
	

}
}
	
