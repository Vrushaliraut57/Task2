import java.util.Scanner;
public class Rectangle {
	
	public static void main(String[] args) {
		//here a define a Scanner
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter Number of lines:");
        int n=sc.nextInt(); //input by a console
        //logic is here
        for(int i=n;i>0;i--) {
        	for(int j=n;j>0;j--) {
        		if(j<=i)
        			System.out.print(i);
        		else
        			System.out.print(j);
        	}
        	System.out.println();
        }
        //scanner is close
        sc.close();
        
	}

}
