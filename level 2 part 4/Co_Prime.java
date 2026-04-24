import java.util.*;

public class  Co_Prime  {  
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("enter number");
	int a = sc.nextInt();
    
	System.out.println("enter number");
	int b = sc.nextInt();

	while(b != 0) {
	     int remainder = a % b;
	     a = b;
	     b = remainder;
	}  
        int GCD = a;

        if(GCD == 1) {
           System.out.print("co-prime");
        }  else {
           System.out.print("not co-prime");
        }
	}
}