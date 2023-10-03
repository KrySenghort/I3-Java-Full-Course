import java.util.Scanner;

public class Ex01ArithmeticOperation {
  public static void main(String[] args) {
    System.out.println("Enter num1 op num2 (5*7) : ");
    Scanner scan = new Scanner(System.in);
    double d1 = scan.nextDouble();
    char op = scan.next().charAt(0);
    double d2 = scan.nextDouble();

    if (op == '+') {
      System.out.println(d1 + d2);
    } else if (op == '-') {
      System.out.println(d1 - d2);
    } else if (op == '/') {
      System.out.println(d1 / d2);
    } else if (op == '*') {
      System.out.println(d1 * d2);
    } else {
      System.out.println("Invalid choice !!! ");
    }
  }
}
