import java.util.*;

public class FactoCal {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter n for factorial");
	 int n = sc.nextInt();
	 
	 int sum = 1;

	 for(int i=1; i<=n; i++) {
        sum = sum * i;
	 }
	  System.out.println(sum);
	}
}