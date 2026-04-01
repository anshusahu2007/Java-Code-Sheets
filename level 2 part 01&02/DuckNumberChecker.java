import java.util.*;

public class DuckNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 4-digit number ");
        int number = sc.nextInt();

        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 0) {
                System.out.println("Duck Number");
                return;
            }

            temp = temp / 10;
        }

        System.out.println("Not Duck Number");
    }
}