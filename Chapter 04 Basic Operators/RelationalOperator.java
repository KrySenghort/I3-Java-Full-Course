public class RelationalOperator {
  // Relational Operators : is used to do comparisons.(<,>,<=,>=,==).
  // How to solve the quadaratic equation.
  static int a = 2;
  static int b = 3;
  static int c = 3;

  public static void main(String[] args) {
    double delta = Math.pow(b, 2) - 4 * a * c;
    if (delta >= 0) {
      System.out.println("there exist roots");
    } else if (delta == 0) {
      System.out.println("there exist same double roots.");
    } else {
      System.out.println("there does not exist roots");
    }
  }
}
// there does not exist roots