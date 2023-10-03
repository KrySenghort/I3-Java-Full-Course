
// import java.io.*;
import java.io.Serializable;

public class Transcient implements Serializable {
  int i = 0, j = 20;
  transient int k = 30;
  transient static int l = 30;
  transient final int m = 50;

  public static void main(String[] args) {
    Transcient output = new Transcient();
    // // Serialization
    // FileOutputStream fos = new FileOutputStream("abc.txt");
    // ObjectOutputStream oos = new ObjectOutputStream(fos);
    // oos.writeObject(input);
    // // De-serialization
    // FileInputStream fis = new FileInputStream("abc.txt");
    // ObjectInputStream ois = new ObjectInputStream(fis);
    // Transcient output = (Transcient) ois.readObject();
    System.out.println("i = " + output.i);
    System.out.println("j = " + output.j);
    System.out.println("k = " + output.k);
    System.out.println("m = " + output.m);

  }
}
