import java.util.*;

public class AreaPerameter {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("enter Area & perameter");
	int side = sc.nextInt();

	int area = side * side;
	int perameter = 4 * side;

	System.out.println("area = "+ area);
	System.out.println("Perameter = "+ perameter);
	
	}
}