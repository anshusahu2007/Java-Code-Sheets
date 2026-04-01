import java.util.*;

public class SecondToHourMinute {
	 public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter seconds");
	   int seconds = sc.nextInt();

	   int hour = seconds / 3600;
	   int remaining = seconds % 3600;

	   int minute = remaining / 60;
	   int second = remaining % 60;

	   System.out.println("hour = " + hour);
	   System.out.println("minute = " + minute);
	   System.out.println("second = " + second);
	 }
}