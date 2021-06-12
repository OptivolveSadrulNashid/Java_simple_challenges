import java.util.Scanner;

public class EvenOrOdd {

   public static boolean isEven(int n) {
       //  use of % modulus to find
       return n % 2 == 0;
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a number to find Even or Odd: ");
       int userNum = scanner.nextInt();
       System.out.println("The number is: " + (isEven(userNum)? "even":"odd"));
   }
}
