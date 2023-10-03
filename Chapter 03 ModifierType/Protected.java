public class Protected extends B {
  public static void main(String[] args) {
    Protected p = new Protected();
    p.x = 2;
    p.y = 3;
    p.z = 4;
    p.operation();

  }
}

class B {
  protected char sex;
  int x, y, z;

  protected void operation() {
    int sum = x + y + z;
    double division = (x / y) + z;
    float square_sum = x * x + y * y + z * z;
    System.out.print("the summation of x y and z is " + sum);
    System.out.printf("\nthe division between x y and z is %f ", division);
    System.out.println("\nthe square sum of x y and z is " + square_sum);
  }
}
// Output:
// the summation of x y and z is 9
// the division between x y and z is 4.000000
// the square sum of x y and z is 29.0
