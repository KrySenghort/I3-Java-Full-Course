public class FinalModifier {
  // // The following are examples of declaring constants:
  // public static final int BOXWIDTH = 6;
  // static final String TITLE = "Manager";

  // public static void main(String[] args) {
  // final int value1 = 32;
  // int value1 = 23;
  // int value2 = 10;
  // value2 = 12;
  // System.out.printf("Value after changement is %d", value2);
  // System.out.printf("Value1 after change is %d", value1);
  // }

}

class ParentClass {
  int num = 10;

  final void showData() {
    System.out.println("Inside ParentClass showData() method");
    System.out.println("num = " + num);
  }
}

class ChildClass extends ParentClass {
  void showData() {
    System.out.println("Inside ChildClass showData() method");
    System.out.println("num = " + num);
  }
}
