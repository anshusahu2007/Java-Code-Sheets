import java.util.*;

public class SwapTwoVariable {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("enter two value for swapping");
	int a = sc.nextInt();
	int b = sc.nextInt();

	System.out.println("Before Swapping = " + a +" "+ b);

	a = a + b;
	b = a - b;
	a = a - b;

    System.out.println("After Swapping = " + a +" "+ b);
	}
}