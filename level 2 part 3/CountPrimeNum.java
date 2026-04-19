import java.util.*;

public class CountPrimeNum {
	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter number");
	   int number = sc.nextInt();
       
       int sum = 0;

	   for(int i=2; i<=number; i++) {

	      boolean condition = true;
	       for(int j=2; j<i; j++) {
	         if(i % j == 0) {
	            condition = false;
	            break;
	         }
	       }
	        if(condition) {
	           System.out.println(i+" ");
	           sum++;
	        }
	   }
	     System.out.println("total prime is "+ sum);
	}
}