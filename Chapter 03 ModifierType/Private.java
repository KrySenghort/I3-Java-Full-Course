public class Private {
  private String Name;

  public void loop() {
    for (int i = 1; i < 11; i++) {
      System.out.print(i + ",");
    }
  }

  public static void main(String[] args) {
    Private p1 = new Private();
    p1.Name = "Dara";
    System.out.println("Your name is " + p1.Name);
    p1.loop();
  }
}
// Your name is Dara
// 1,2,3,4,5,6,7,8,9,10,