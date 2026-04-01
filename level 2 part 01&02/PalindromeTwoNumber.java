import java.util.*;

public class PalindromeTwoNumber {
	  public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    System.out.println("enter 2 number");
	    int number = sc.nextInt();

	    int first = (number / 10);
	    int last = (number % 10);

	    if(first == last) {
	       System.out.println("palindrome");
	    }
	      else  {
	             System.out.println("not palindrome");
	      }
	  }
}