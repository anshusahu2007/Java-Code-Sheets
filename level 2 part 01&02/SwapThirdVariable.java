import java.util.*;

public class SwapThirdVariable {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter 2 number for swap");
     int a = sc.nextInt();
     int b = sc.nextInt();

     System.out.println(" Beafor Swapping "+ a +" "+ b);

     int temp = a;
     a = b;
     b = temp;

     System.out.println(" After Swapping "+ a+" "+ b);
	}
}