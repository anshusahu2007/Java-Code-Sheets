import java.util.*;

public class CountMultiple {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

	   System.out.println("Enter n");
	   int n = sc.nextInt();
	   System.out.println("Enter m");
	   int m = sc.nextInt();
	   
       int count = 0;

	   for(int i=m; i<=n; i++) {

	     if(i % m == 0) {
	        System.out.println(i); 
	         count++;
	     }

	   } 
	   System.out.println("total count is:- " + count); 
	   
	}
} 