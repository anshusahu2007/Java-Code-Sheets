import java.util.*;

public class SquareSumSeries {
	   public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    System.out.println("enter n number");
	    int n = sc.nextInt();
         
         int sum = 0;

	    for(int i=1; i<=n; i++) {
            int square = i*i;

	       if(square % 2 == 0) {
	         sum -= square;

	       } else {
	           sum += square;
	       }
	    }
	      System.out.print(sum);
	   }
}