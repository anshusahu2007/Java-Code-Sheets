import java.util.*;

public class CountEvenDigit {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter 4 digit number");
	  int number = sc.nextInt();

	   int count = 0;

        while (number > 0) {
            int digit = number % 10;   

            if (digit % 2 == 0) {   
                count++;
            }

            number = number / 10;        
        }

         System.out.println("Number of even digits: " + count);
	}
}