import java.util.Arrays;

public class ArrayClass {
  public static void main(String[] args) {
    // fill(array,value) : fill whole of array.
    int[] numbers1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    numbers1 = new int[8];
    Arrays.fill(numbers1, 3);
    System.out.println("The first array is represented by: ");
    for (int i = 0; i < numbers1.length; i++) {
      System.out.println("numbers1[" + i + "] : " + numbers1[i]);
    }
    // Output:
    // The first array is represented by:
    // numbers1[0] : 3
    // numbers1[1] : 3
    // numbers1[2] : 3
    // numbers1[3] : 3
    // numbers1[4] : 3
    // numbers1[5] : 3
    // numbers1[6] : 3
    // numbers1[7] : 3
    // ====================================================================
    // fill(array,BeginIndex,EndIndex,value)
    int[] numbers2 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    Arrays.fill(numbers2, 3, 7, 5);
    System.out.println("The Second array is represented by: ");
    for (int j = 0; j < numbers2.length; j++) {
      System.out.println("numbers2[" + j + "] : " + numbers2[j]);
    }
    // Output:
    // The Second array is represented by:
    // numbers2[0] : 0
    // numbers2[1] : 0
    // numbers2[2] : 0
    // numbers2[3] : 5
    // numbers2[4] : 5
    // numbers2[5] : 5
    // numbers2[6] : 5
    // numbers2[7] : 0
    // ======================================================================
    // filling string:
    String[] strings = { "", "", "" };
    strings = new String[3];
    Arrays.fill(strings, "hello");
    for (int k = 0; k < strings.length; k++) {
      System.out.println("string[" + k + "] : " + strings[k]);
    }
    // Output:
    // string[0] : hello
    // string[1] : hello
    // string[2] : hello
    // ======================================================================
    String[] strings1 = { "", "", "" };
    strings1 = new String[3];
    Arrays.fill(strings1, "Daddy");
    for (int m = 0; m < strings1.length; m++) {
      System.out.println("strings1[" + m + "] : " + strings1[m]);
    }
    // strings1[0] : Daddy
    // strings1[1] : Daddy
    // strings1[2] : Daddy
    String[] points = { "", "", "" };
    points = new String[3];
    Arrays.fill(points, 0, 2, new String("(1, 2)"));
    for (int n = 0; n < points.length; n++) {
      System.out.println("points[" + n + "] : " + points[n]);
    }
    // points[0] : (1, 2)
    // points[1] : (1, 2)
    // points[2] : null
    System.out.print("the full array points = [");
    for (int s = 0; s < points.length; s++) {
      System.out.print("," + points[s]);
    }
    System.out.print("]");
  }
  // the full array points = [,(1, 2),(1, 2),null]
}












