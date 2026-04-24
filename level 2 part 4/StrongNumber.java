import java.util.*;

public class StrongNumber {
	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter n number");
	   int n = sc.nextInt();

       for(int i=1; i<=n; i++) {

              int sum = 0;
              int num = i;

            while(num > 0) {
                int digit = num % 10;
                   
                   int fact = 1;
                   for(int j=1; j<=digit; j++) {
                      fact = fact * j;
                    }

                      sum = sum + fact;
                      num = num/10;
                }

                  if(sum == i) {
                       System.out.print(i + " ");
            }
        }
    }
}