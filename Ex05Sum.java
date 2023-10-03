import java.util.Scanner;

// Write a program which reads a sequence of integers from the user and stops by displaying "Done" 
// when the Sum of these values exceed 100.
public class Ex05Sum {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number : ");
    int n = scan.nextInt();

    int sum = 0;
    while (sum <= 100) {
      System.out.println("Enter a number : ");
      sum += scan.nextInt();

    }
    System.out.println("Done " + sum);

  }
}
