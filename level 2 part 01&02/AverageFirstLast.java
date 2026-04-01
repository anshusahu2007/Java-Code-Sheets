import java.util.*;

public class AverageFirstLast {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter 4 digit");
	 int number = sc.nextInt();

	 int First = (number / 1000);
	 int Last = (number % 1000) % 10;

	 Double Average = (First + Last) / 2.0;
     
	 System.out.println(Average);
	}
}