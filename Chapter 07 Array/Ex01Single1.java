import java.util.Scanner;

public class Ex01Single1 {
  // Array is a collection of variables of the same data types.
  // - array in java is an object.
  // - array variable references a group of data.
  // - the size of an array is fixed.
  public static void main(String[] args) {
    // ====================================== Exercise 01
    // int[] numbers = { 1, 2, 3, 4, 5 };
    // numbers[0] = 5;
    // numbers[1] = 1;
    // numbers[2] = 4;
    // System.out.println("numbers = [1, 2, 3, 4, 5]");
    // System.out.println("Index[0] = " + numbers[0]);
    // System.out.println("Index[1] = " + numbers[1]);
    // System.out.println("Index[2] = " + numbers[2]);
    // Output:
    // numbers = [1, 2, 3, 4, 5]
    // Index[0] = 5
    // Index[1] = 1
    // Index[2] = 4
    // ====================================== Exercise 02
    // double[] lists = { 1.2, 1.4, 5.6, 6.7 };
    // lists[0] = 2.3;
    // lists[1] = 3.8;
    // lists[2] = 4.9;
    // lists[3] = 5.4;
    // System.out.println("lists = [1.2,1.4,5.6,6.7]");
    // for (int i = 0; i < lists.length; i++) {
    // System.out.println("lists[" + i + "] = " + lists[i]);
    // }
    // Output:
    // lists = [1.2,1.4,5.6,6.7]
    // lists[0] = 2.3
    // lists[1] = 3.8
    // lists[2] = 4.9
    // lists[3] = 5.4
    // ====================================== Exercise 03
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of elements you want to store: ");
    int n = scan.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Enter number[" + i + "]   : ");
      array[i] = scan.nextInt();
    }
    System.out.print("Array elements are: [");
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.print("]");
  }
}
