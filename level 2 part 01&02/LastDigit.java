
import java.util.*;

public class LastDigit  {
	public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter number");
	  int number = sc.nextInt();

	  int lastdigit = (number % 10);

	  System.out.println(lastdigit);
	}
}