import java.util.*;


public class CountDigitNum {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter number's ");
	  int number = sc.nextInt();
	  int count = 0;
	  
	   while(number > 0) {
	   	
	   	   count++;
	   	    number = number/10;
	   }
	    System.out.println("total count is " + count);
	}
}