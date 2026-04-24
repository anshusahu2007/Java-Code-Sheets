import java.util.*;

public class GeometricProgression {
	public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter a");
	  int a = sc.nextInt();

	  System.out.println("enter r");
	  int r = sc.nextInt();

	  System.out.println("enter n");
	  int n = sc.nextInt();
       
       int term = a;

	  for(int i=1; i<=n; i++) {
           System.out.print(term + " ");
              term = term * r;
	    }
	}
}