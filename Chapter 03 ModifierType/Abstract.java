abstract class student {
  String name = "Senghort";
  double score1 = 100;
  double score2 = 200;
  double score3 = 300;

  abstract String getName();

  abstract double computeAvg();
}

class Score extends student {
  double average = (score1 + score2 + score3) / 3;

  public double computeAvg() {
    return average;
  }

  public String getName() {
    return name;
  }
}

public class Abstract {
  public static void main(String[] args) {
    Score student1 = new Score();
    System.out.println("Student's name is " + student1.getName());
    System.out.println("The average score is " + student1.computeAvg());
  }
}
// Student's name is Senghort
// The average score is 200.0