import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex02Single2 {
  public static void main(String[] args) {
    char chars[] = { 'a', 'b', 'c', 'd', 'e' };
    // Index -1 out of bounds for length 4
    System.out.println(chars[1]);
    // Index 4 out of bounds for length 4.
    System.out.println(chars[4]);
    System.out.println(chars);

    Integer arr[] = { 1, 2, 3, 4, 5, 6 };
    System.out.println("Array :" + Arrays.toString(arr));
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
    arrayList.add(7);
    arr = arrayList.toArray(arr);
    System.out.println("Ärray after adding element : " + Arrays.toString(arr));
  }
}
