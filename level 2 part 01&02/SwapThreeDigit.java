import java.util.*;

public class SwapThreeDigit {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter 3 digit");
	 int number = sc.nextInt();

	 int First = (number / 100);
	 int Middle = (number / 10) % 10;
	 int Last = (number % 10);
     
	 System.out.println(Last +" "+ Middle+" "+ First);
	}
}