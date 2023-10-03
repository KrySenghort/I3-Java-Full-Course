import java.util.Scanner;

// write a program that asks the user to input a four-digit numbers and tell if the nubmer is a lucky number or not.
// Ex: 3452:  3+4 = 5+2
public class Ex02LuckyNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a four-digit number");
    int n = scan.nextInt();
    // ABCD
    if (n < 1000) {
      System.out.println("It is not a lucky number");
    } else {
      int fourDigit = n % 10; // D
      int thirdDigit = (n / 10) % 10; // ABC % 10 = C
      int secondDigit = (n / 100) % 10;// AB % 10 = B
      int firstDigit = (n / 1000) % 10;// A % 10 = A
      if (firstDigit + secondDigit == thirdDigit + fourDigit) {
        System.out.println("it is a lucky number");
      } else {
        System.out.println("not lucky");
      }
    }
  }
}
