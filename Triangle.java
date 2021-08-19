import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Number of lines:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=i;j<=2*i-1;j++) {
        			System.out.print(j);
        		
        	}
        	for(int k=2*i-2;k>=i;k--) {
        		System.out.print(k);
        	}
        	System.out.println();
        }
        sc.close();
        
	}

}
