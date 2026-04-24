import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("enter number");
	    int number = sc.nextInt();

	    int n=0,m=1;
        int sum = 0;

	    System.out.print(n+" "+m);

	    for(int i=2; i<number; i++) {

	    	 sum = n+m;
	    	 System.out.print(" "+sum);

	    	 n=m;
	    	 m=sum; 
	    	 	
	    	 
	    }
	}
}