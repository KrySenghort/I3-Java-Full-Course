class D {
  int count;

  void increment() {
    count++;
  }
}

public class SyChronized {
  public static void main(String[] args) throws InterruptedException {
    D c = new D();
    Thread t1 = new Thread(new Runnable() {
      public void run() {
        for (int i = 1; i <= 100; i++) {
          c.increment();
        }
      }
    });
    Thread t2 = new Thread(new Runnable() {
      public void run() {
        for (int i = 1; i <= 100; i++) {
          c.increment();
        }
      }
    });
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.print("Count = " + c.count);
  }
}
