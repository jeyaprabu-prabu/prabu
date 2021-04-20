package MT;
class X extends Thread
{
synchronized public void run()
{
	 for(int num=450;num<=550;num++)
     {
		 try {
				sleep(100);
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
class Y extends Thread
{
synchronized	public void run()
	{
		int s;
		int num=75413;
		for(int i=1;i<=20;i++)
		{
			//if(i==10){
				//stop();
		//}
			s=i*num;
			System.out.println(i+ "*"+num +"="+s);
		}
		
	}
}
public class dependent_threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		X v=new X();
		Y w=new Y();
		v.start();
		w.start();
		
		

	}

}
