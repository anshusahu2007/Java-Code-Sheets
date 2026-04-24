import java.util.*;

public class LCM {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("enter number");
	int a = sc.nextInt();

	System.out.println("enter number");
	int b = sc.nextInt();
    
    int x = a , y = b;
	while(b != 0) {
	    int remainder = a % b;
	    a = b;
	    b = remainder;
	  }
	   int GCD = a;

	  int LCM = x*y/GCD;
	  System.out.println(LCM);
	}
}