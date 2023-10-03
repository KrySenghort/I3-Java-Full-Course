import java.util.Scanner;

public class Chapter02VariableType {
  // instance variables
  int x = 3;
  long y = 34343;
  float z = (float) 34343.343;
  double u = 3.43;
  byte w = 34;
  short v = 3;
  String Name = "Dara";

  public static void main(String[] args) {
    // local variable
    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = 2 < 3;
    boolean b4 = 2 > 3;
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    input X = new input();
    X.delete();
    Chapter02VariableType l = new Chapter02VariableType();
    A a1 = new A();
    a1.d(l.Name, l.x);
    int delta = l.v * l.v - 4;
    a1.e(delta);
  }
}

class input {
  // local varialbe
  void delete() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter c : ");
    int c = scan.nextInt();
    if (c == 1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

// class or static variables
class A {
  void d(String name, int ID) {
    System.out.println("your name is " + name);
    System.out.println("your ID is " + ID);
  }

  void e(float delta) {
    if (delta > 0) {
      System.out.println("there are two roots in real number set.");
    } else if (delta == 0) {
      System.out.println("there are same two roots in real number set.");
    } else {
      System.out.println("there are no root in real number or existing in complex set number.");
    }
  }
}
// Remark :
// [1]. String s = scan.next() : is used for the string that has no space.
// [2]. String s = scan.nextLine() : is used for the string that has space.
// [3]. Double a = scan.nextDouble() : is used for the double number.
// [4]. Float b = scan.nextFloat() : is used for the floating point.
// [5].