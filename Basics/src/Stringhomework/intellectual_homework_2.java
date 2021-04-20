package Stringhomework;

public class intellectual_homework_2 {
	
	//PRINTING ALL REPEATED CHARACTERS

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="be intellectually inspiring by ignoring others innocence but not ignorance";
		char c[]=s.toCharArray();
		
		
		 for(int i=0; i<c.length; i++)
		{
			
				for(int j=i+1; j<c.length; j++)					
				{					
					if(c[i]==c[j])	
					{						
						c[j]='0';						
					
					}
				}
			
					if( c[i]!='0' && c[i]!=' ')
					{
						System.out.println(c[i]);
				
					
				   }	
				}
			}


	}


