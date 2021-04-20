package Stringhomework;

public class intellectual_home_work_1 {
	
	//COUNT OF EACH CHARACTERS

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="be intellectually inspiring by ignoring others innocence but not ignorance";
		char c[]=s.toCharArray();
		
		
		 for(int i=0; i<c.length; i++)
		{
			int count=1;
				for(int j=i+1; j<c.length; j++)					
				{					
					if(c[i]==c[j])	
					{
						count=count+1;
						c[j]=' ';			
					
					}
				}			
			
					if( c[i]!=' ')
					{
						System.out.println(c[i] +"===>"+count);
				
					
				   }	
			}


	}

}
