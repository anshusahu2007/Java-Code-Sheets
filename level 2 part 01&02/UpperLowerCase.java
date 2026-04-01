import java.util.*;

public class UpperLowerCase {
	public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);

	  System.out.println("input alphabet character");
	  char character = sc.next().charAt(0);

	  if (character >= 'A' && character <= 'Z')  {
	      System.out.println("UPPER CASE");
	  } 
	     else {
	            System.out.println("LOWER CASE");
	     }
	}
}