import java.util.*;

public class DigitSumDivisible {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;  
            sum = sum + digit;     
            temp = temp / 10;     
        }

        System.out.println("Sum of digits = " + sum);

        if (sum % 3 == 0) {
            System.out.println(number + " is divisible by 3");
        } else {
            System.out.println(number + " is NOT divisible by 3");
        }
    }
}