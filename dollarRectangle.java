package dollarRectangle;
import java.util.Scanner;

public class dollarRectangle {

		public static void main(String[] args) {
			//here is a Scanner
			Scanner sc = new Scanner(System.in);
			
	        System.out.println("Enter Number of lines:");
	        int n=sc.nextInt(); //input by console
	        for(int i=0;i<n;i++) {
	        	for(int j=0;j<(2*n);j++) {
	                //upper left triangle
	        		if(i+j<=n-1)
	        			System.out.print("$");
	        		else
	        			System.out.print(" ");
	        		
	        		//logic for upper right triangle
	        		if((i+n)<=j)
	        			System.out.print("$");
	        		else
	        			System.out.print(" ");
	        	}
	        	System.out.println();
	        }
	        for(int i=0;i<n;i++) {
	        	for(int j=0;j<(2*n);j++) {
	                //down half left triangle
	        		if(i>=j)
	        			System.out.print("$");
	        		else
	        			System.out.print(" ");
	        		
	        		//down half right triangle
	        		if(i>=(2*n-1)-j)
	        			System.out.print("$");
	        		else
	        			System.out.print(" ");
	        	}
	        	System.out.println();
	        } 
	        //scanner is close
	        sc.close();
		}

	}

