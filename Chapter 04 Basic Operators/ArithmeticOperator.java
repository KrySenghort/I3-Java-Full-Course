import java.lang.Math;

public class ArithmeticOperator {
  // Arithmetic Operators : is used to do some calculation operations(+,-,*,/)
  double w = 23.43;
  int x = 12;
  int y = 34;
  double z = 32.43;
  long u = 999999999;
  short v = 2343;
  byte t = 34;
  float sum = x * 2;
  float division = x / y;
  double multiplication = x * y * z;
  long Substraction = u - x - t - y;
  double power = Math.pow(w, z); // Remark: Math.pow() is supported with double data type.
  float Power = (float) (Math.pow(w, z));
  float sqare_root = (float) Math.sqrt(w);

  public static void main(String[] args) {
    ArithmeticOperator a = new ArithmeticOperator();
    System.out.println(a.sum);
    System.out.println(a.division);
    System.out.println(a.multiplication);
    System.out.println(a.power);
    System.out.println(a.sqare_root);
    System.out.println(a.power);
    System.out.println(a.Substraction);

  }
// Output:
// 24.0
// 0.0
// 13231.44
// 2.6406772212855618E44
// 4.8404546
// 2.6406772212855618E44
// 999999919
}
