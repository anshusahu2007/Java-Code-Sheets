
import java.util.*;

public class MiddleDigit  {
	public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter three digit number");
	  int number = sc.nextInt();

	  int MiddleDigit = ((number / 10) % 10);

	  System.out.println(MiddleDigit);
	}
}