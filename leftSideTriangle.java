package leftSideTriangle;
import java.util.Scanner;

public class leftSideTriangle{

		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
		
	        System.out.println("Enter Number of lines:");
	        int n=sc.nextInt(); //input here by console
	        int flag=0;
	        for(int i=0;i<n;i++) {
	        	for(int j=0;j<=i;j++) {
	        		System.out.print(flag); //show output here
	        		flag=1-flag;
	        	}
	        	System.out.println(); // print a new line
	        }
	        sc.close();
		}
		
	}

