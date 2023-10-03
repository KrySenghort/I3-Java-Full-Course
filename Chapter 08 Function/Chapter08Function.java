import java.util.Scanner;

public class Chapter08Function {
  // user defined function.
  // build in function(return, non-return, recursive)
  // ========================================================== Exercise 01:
  // public static void increment(int x) {
  // x = x + 1;
  // System.out.println(x);
  // }

  public static void main(String[] args) {
    // Exercise 01
    // int x = 12;
    // increment(x);
    // System.out.println(x);

    // Exercise 02
    // int x = 1;
    // int y = 1;
    // for (int i = 1; i < 10; i++) {
    // x += i;
    // System.out.println(i);
    // }
    // for (int j = 1; j < 10; j++) {
    // y += j;
    // System.out.println(j);
    // }

    // Exercise 03
    // System.out.println("Enter your name and age : ");
    // System.out.println(getName() + "" + getAge());
    // }
    // public static String getName() {
    // return new Scanner(System.in).nextLine();
    // }
    // public static double getAge() {
    // return new Scanner(System.in).nextDouble();
    // }

    // Exercise 04
    // System.out.println("message 1");
    // sayHi("Hello");
    // System.out.println("message 2");
    // System.out.println("The summation is : " + sum(2, 4));
    // }
    // public static void sayHi(String x) {
    // System.out.println(x);
    // }
    // public static int sum(int x, int y) {
    // int sum = x + y;
    // return sum;{
    // }
    // Remark : the datatype of return type must be same as function type.

    // Exercise 05 Method Overloading
    System.out.println(sum(2, 3));
    System.out.println(sum("dara", "daro"));
    System.out.println(sum(3, 5, 7));
    System.out.println(sum((float) 4.55));

  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int x, int y, int z) {
    return x + y + z;
  }

  public static String sum(String a, String b) {
    return a.concat(" " + b);
  }

  public static float sum(float c) {
    return c - (float) 60.56;
  }
}