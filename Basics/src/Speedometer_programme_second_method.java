
public class Speedometer_programme_second_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int l=0;l<=9999; l++)
		 {
			if(l<=9){
			 System.out.print("000");
			}
			if(l>=10 &&l<=99){
				 System.out.print("00");
			}
			 
		    if(l>=100 && l<=999){
					 System.out.print("0");	 
				 }
		 if(l>=1000 && l<=9999){
			 System.out.print("");
			 }
		 System.out.println(l);
         }
	}
}
