import java.util.*;

public class PrimeNumCheck {
     public static void main(String[] args) {
           
         Scanner sc = new Scanner(System.in);
         
         System.out.println("enter number");
         int number = sc.nextInt();

         boolean condition = true;

         if(number <= 1) {
             condition = false;
        } else {
             for(int i=2; i<number; i++) {
                 if(number % i == 0) {
                    condition = false;
                    break;
                }
            }
        } 
             if(condition) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
        }
    }
} 