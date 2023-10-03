public class Chapter06LoopControl {
  // for loop
  // while loop
  // do-while loop
  // Loop Control Statement.
  // Break Statment.
  // Continue Statement.
  public static void main(String[] args) {
    // String word = "I love AMS";
    // int i = 1;
    // while (i <= 100) {
    // System.out.printf(word);
    // System.out.print(" " + i);
    // System.out.print("\n");
    // i++;
    // }
    // for (int j = 1; j <= 100; j++) {
    // System.out.printf(word);
    // System.out.print(" " + j);
    // System.out.print("\n");
    // }

    // int i = 1;
    // System.out.println("the even number is such that :");
    // while (i <= 100) {
    // if (i % 2 == 0) {
    // System.out.print(i);
    // System.out.printf(",");
    // }
    // i++;
    // }
    // System.out.println("\nthe odd number is such that :");
    // int j = 1;
    // while (j <= 100) {
    // if (j % 2 != 0) {
    // System.out.print(j);
    // System.out.printf(",");
    // }
    // j++;
    // }
    // ========================================================================================
    // int i = 1;
    // System.out.println("the numbers that are divided by 3 are such as :");
    // do {
    // if (i % 3 == 0) {
    // System.out.print(i + ",");
    // }
    // i++;
    // } while (i <= 100);
    // //
    // ================================================================================
    // int j = 1;
    // System.out.println("\nthe numbers that are divided by 7 are such as :");
    // do {
    // if (j % 7 == 0) {
    // System.out.print(j + ",");
    // }
    // j++;
    // } while (j <= 100);
    // //
    // ================================================================================
    // int i = 1;
    // int j = 1;
    // System.out.println("the multiplication table is shown below :");
    // do {
    // System.out.print(i + "x" + j + " =" + i * j);
    // System.out.print("\n");
    // j++;
    // } while (j <= 12);
    // ================================================================================
    // for (int i = 1; i <= 3000; i++) {
    // if (i % 3 == 0 && i % 7 == 0) {
    // System.out.println(i);
    // }
    // }
    // ================================================================================
    int sum = 0;
    for (int i = 2; i <= 500; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
      }
    }
    System.out.println("the sum of even number between 2 to 500 is :" + sum);
  }
}