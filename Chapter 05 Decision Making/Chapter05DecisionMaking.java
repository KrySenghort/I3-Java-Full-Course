import java.util.Scanner;

// import java.util.Scanner;

public class Chapter05DecisionMaking {
  // if statement
  // if else statement.
  // if else...if else.. statement.
  // Nested if statement.
  // ? Operator.
  // switch statement.
  public static void main(String[] args) {
    // ===================================================== Exercise 01
    // System.out.printf("Enter num1 : ");
    // int a = input.nextInt();
    // System.out.printf("Enter number2 :");
    // int b = input.nextInt();
    // if (a > b) {
    // System.out.println("a is greater than b");
    // } else if (a == b) {
    // System.out.println("a is equal b");
    // } else {
    // System.out.println("b is greater than a");
    // }
    // System.out.printf("Enter number3 :");
    // int c = input.nextInt();
    // if (c % 2 == 0) {
    // System.out.print("c is even number.");
    // } else {
    // System.out.print("c is odd nmber");
    // }
    // ===================================================== Exercise 02
    // System.out.println("Enter number :");
    // int a = input.nextInt(); // ternary operator.
    // a = (a>0)?1:(a<0)?2:0;
    // switch(a){
    // case 1:
    // System.out.println("it is positive number.");
    // break;
    // case 2:
    // System.out.println("it is negative number.");
    // break;
    // default:
    // System.out.println("a = 0");
    // }
    // ===================================================== Exercise 03
    // System.out.print("Enter speed of wind :");
    // int s = input.nextInt();
    // if(s>0 && s<62){
    // System.out.println("it is normal");
    // }
    // else if(s>62 && s<88){
    // System.out.println("it is tropical depression");
    // }
    // ===================================================== Exercise 04
    // int a = 10;
    // int b = 34;
    // int max = a < b ? b : a;
    // System.out.println(max); // 34
    // ===================================================== Exercise 05
    // String x = "Neso Academy";
    // System.out.println(!x.isEmpty() ? x : "Neso Academy is invalid"); // Neso
    // Academy.
    // ===================================================== Exercise 06
    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter number : ");
    // int n = scan.nextInt();
    // if (n % 2 == 0) {
    // System.out.println("n is an even number");
    // } else {
    // System.out.println("n is an odd number");
    // }
    // System.out.println();
    // ===================================================== Exercise 07
    // ==> relational operator(==,!=,>=,<=,>,<,++,+=,-=,*=,/=)
    boolean b1 = (1 == 1);
    boolean b2 = (2 == 3);
    boolean b3 = (2 + 3) == (6 - 1);
    boolean b4 = (1 != 1);
    boolean b5 = (2 != 3);
    // System.out.println(b1); // true
    // System.out.println(b2); // false
    // System.out.println(b3); // true
    // ===================================================== Exercise 08
    boolean b6 = (1 >= 1);
    boolean b7 = (2 >= 3);
    boolean b8 = (2 + 3) >= (6 - 2);
    System.out.println(b6); // true
    System.out.println(b7); // false
    System.out.println(b8); // true
    // ===================================================== Exercise 09
    // System.out.println("Enter n: ");
    // int n = input.nextInt();
    // switch(n){
    // case 10:
    // System.out.println("10");
    // break;
    // case 90:
    // System.out.println("20");
    // break;
    // case -3:
    // System.out.println("30");
    // break;
    // default:
    // System.out.println("None of the above");
    // }
    // ===================================================== Exercise 10
    System.out.println("Enter value of abbreviation(Km/h) = ");
    Scanner input = new Scanner(System.in);
    int abbreviation = input.nextInt();
    System.out.println("Enter value of speed(knot) = ");
    int speed = input.nextInt();
    int number;
    number = (abbreviation < 62) && ((speed >= 34) && (speed < 48)) ? 1
        : ((abbreviation >= 62) && (abbreviation < 89)) && ((speed >= 34) && (speed < 48)) ? 2
            : ((abbreviation >= 89) && (abbreviation < 118) && ((speed >= 64) && (speed < 64))) ? 3
                : ((abbreviation >= 118) && (abbreviation < 221) && ((speed >= 64) && (speed < 120))) ? 4
                    : ((abbreviation >= 220)) && (speed >= 119) ? 5
                        : 0;
    System.out.println("Abbreviation = " + abbreviation + "\nSpeed = " + speed);
    switch (number) {
      case 1:
        System.out.println("Tropical Depression");
        break;
      case 2:
        System.out.println("Tropical Storm");
        break;
      case 3:
        System.out.println("Severe Tropical Storm");
        break;
      case 4:
        System.out.println("Typhon");
        break;
      case 5:
        System.out.println("Super Typhon");
        break;
      default:
        System.out.println("Invalid");
    }
  }
}
