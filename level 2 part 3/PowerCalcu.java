import java.util.*;

public class PowerCalcu {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("enter base:- ");
	int base = sc.nextInt();
    System.out.print("enter exponent:- ");
	int exponent = sc.nextInt();

	int result = 1;

	for(int i=1; i<=exponent; i++) {
          result = result * base;
	  }
	    System.out.println("result is:- "+ result);
	}
}