package MT;
class A extends Thread
{
	public void run()
{
		 for(int num=450;num<=550;num++)
	     {
			 try {
				sleep(1*55);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   int count=0;
	     for(int j=1;j<=num;j++)
	      {
	    	 if(num % j == 0)
	    	 {
	    		 count=count+1; 			 
	          }
	      }
	     
	    
	     if(count == 2)
	     {
	    	 System.out.println(num);
	     }
	   }
      }
}

class B extends Thread
{
	@SuppressWarnings("deprecation")
	public void run(){
		int s;
		int num=75413;
		for(int i=1;i<=20;i++)
		{
			if(i==10){
				stop();
		}
			s=i*num;
			System.out.println(i+ "*"+num +"="+s);
		}
	}
	
}
class C extends Thread
{
	public void run()
	{
		for(int num=1; num <=9999; num++)
		{
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int sum=0;
	     for(int i=1; i<num; i++)
	      {
	    	 if(num % i == 0)
	    	 {
	    		 sum=sum + i ;
	    	 }
	      }
	    if( num == sum)
	     {
	    	 System.out.println(num+" is perfect number ...!");
	     }	  
}
	}	
}
public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		C c=new C();
		a.start();
		b.start();
		c.start();

	}

}
