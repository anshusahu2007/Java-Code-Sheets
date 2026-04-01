import java.util.*;

public class AscendingOrder {
	public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter 3 digit");
	  int number = sc.nextInt();

	  int first = (number / 100);
	  int second = (number % 100) / 10;
	  int third = (number % 10);

      if (second > first && third > second) {
         System.out.println("number is ascending order");
      }
        else {
             System.out.println("number is not ascending order");
        }
	  }
	}