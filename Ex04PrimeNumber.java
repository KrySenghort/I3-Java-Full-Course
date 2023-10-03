import java.util.Scanner;

// Write a program which reads a positive number N from the user then indicates if N is prime or not.
public class Ex04PrimeNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = scan.nextInt();
    // method 1:
    int sum = 1;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0)
        sum += i;
      break;
    }
    System.out.println(sum == 1 ? "prime" : "not prime");
    // method 2:
    boolean isPrime = true;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        isPrime = false;
        break;
      }
    }
    System.out.println(isPrime ? "prime" : "not prime");

  }
}
