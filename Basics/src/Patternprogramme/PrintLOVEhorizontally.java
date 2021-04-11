package Patternprogramme;

public class PrintLOVEhorizontally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1; i<=n; i++){
		    for(int j =1; j<=n*5; j++){
		    	if(j == n+1 || j == n*2+1){
		    		System.out.print(" ");
		    	}
		    	if(j == 1 ||i == n && j<=n*2 ||j ==n+1||j==n*2||j>n && j<n* 2 && i==1||i ==j -n*2 || i+j ==n*4 ||j==n*4+1|| i==1
		    			&& j>n*4||i==n / 2 +1 && j>n*4 ||i==n && j>n*4){
		    		System.out.print("* ");
		    	}else{
		    		System.out.print("  ");
		    	}
		    }
		System.out.println();
	}

	}

}
