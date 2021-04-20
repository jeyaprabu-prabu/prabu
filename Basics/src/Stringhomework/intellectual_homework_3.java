package Stringhomework;

public class intellectual_homework_3 {
	
	//PRINTING ALL UNIQUE CHARACTERS

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="be intellectually inspiring by ignoring others innocence but not ignorance";
		char c[]=s.toCharArray();		
		
		 for(int i=0; i<c.length; i++)
		{
			int count=0;
				for(int j=i+1; j<c.length; j++)					
				{					
					if(c[i]==c[j])	
					{						
						count=count+1;		
					     c[j]=0;
					}
				}
					
					if( count==0 && c[i]!=0)
					{
						System.out.println(c[i]);
				
					
				   }	
				}

	      }
	}



