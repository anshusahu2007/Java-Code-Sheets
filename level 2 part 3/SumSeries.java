import java.util.*;

public class SumSeries {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter n");
	  int n = sc.nextInt();
	  int sum = 0;

	  for(int i=1; i<=n; i++) {
           sum += (i*i);
	  }
	    System.out.println("total sum:= "+ sum);
	}
}