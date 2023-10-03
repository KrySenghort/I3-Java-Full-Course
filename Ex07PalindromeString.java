// write a program which finds if a string is a palindrome string or not.
// Palindrome string is read the same starting from the start or the end
// "noon", "aba", "a", "12321" is a palindrome string.
public class Ex07PalindromeString {
  public static void main(String[] args) {
    String str = "noon";
    boolean isPalindrome = true;
    for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
      if (str.charAt(i) == str.charAt(j))
        continue;
      isPalindrome = false;
      break;
    }
    System.out.println(isPalindrome ? "palindrome" : "not palindrome");
  }
}