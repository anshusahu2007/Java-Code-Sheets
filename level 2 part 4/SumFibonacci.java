import java.util.*;

public class SumFibonacci {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number");
		int number = sc.nextInt();

		int n=0, m=1;
		int total = 0;

		for(int i=1; i<=number; i++) {
			 total += n;

			 int sum = n+m;
			 n=m;
			 m=sum; 
		}

		System.out.println("total is = "+ total);
	}
}
