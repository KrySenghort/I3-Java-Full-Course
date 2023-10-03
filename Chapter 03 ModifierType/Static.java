public class Static {
  static String s = "Institute of Technology of Cambodia";

  public static void ex() {
    System.out.print("This static function can be called without creating object.");
  }

  public static void main(String[] args) {
    System.out.println(Static.s);
    Static.ex();
  }
}
// Institute of Technology of Cambodia
// This static function can be called without creating object.