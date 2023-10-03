public class Chaper01BasicDataType {
  // ======= primitive datatypes specifies the size and type of variable values,
  // and it has no additional methods.
  // byte : size 1 and can stores from -128 to 127.
  // short: size 2 bytes and can store the whole numbers from -32768 to 32767
  // int : size 4 bytes and can store the whole numbers from -2147483648 to
  // 2147483647.
  // long : size 8 bytes and can store the whole numbers from -9,223,372,036,854
  // to 9,223,372,036,854,775,807.
  // float: size 4 bytes and can store the fractional numbers
  // boolean : size 1bit and can store true or false values.
  // double : size 8bytes and can store fractional numbers. Sufficient for storing
  // 6 to 7 decimal digits.
  public static void main(String[] args) {
    // char sex = 'M';
    // String name = "Senghort";
    // byte age = 29;
    // short year = 2022;
    // int numOfAcc = 34455;
    // long numOfUser = 22233333;
    // float salary = (float) 23.343;
    // boolean verify = false;
    // double stock = 23.4443;
    // System.out.printf("your name is : %s", name);
    // System.out.printf("\nyour age is %d", age);
    // System.out.printf("\nthis year is : %d", year);
    // System.out.printf("\nyour sex is : %c", sex);
    // System.out.printf("\nyour account number is : %d", numOfAcc);
    // System.out.printf("\nnumber of facebook user is %d", numOfUser);
    // System.out.printf("\nyour salary is %f", salary);
    // System.out.printf("\nthe verification of this condition is %b", verify);
    // System.out.printf("\nthe stock in company is %f", stock);
    // =================================================================================
    // ==> Output:
    // your name is : Senghort
    // your age is 29
    // this year is : 2022
    // your sex is : M
    // your account number is : 34455
    // number of facebook user is 22233333
    // your salary is 23.343000
    // the verification of this condition is false
    // the stock in company is 23.444300
    // ==============================================================================================================
    System.out.println("\nThe minimum value in integer is " + Integer.MIN_VALUE);// -2147483648
    System.out.println("The maximum value in integer is " + Integer.MAX_VALUE); // 2147483647

    System.out.println("The maximum value in short is " + Short.MIN_VALUE); // -32768
    System.out.println("The minimum value in short is " + Short.MAX_VALUE); // 32767

    System.out.println("The maximum value in long integer is " + Long.MAX_VALUE);// 9223372036854775807
    System.out.println("The minimum value in long integer is " + Long.MIN_VALUE);// -128

    System.out.println("The minimum value in byte is " + Byte.MIN_VALUE); // -128
    System.out.println("The maximum value in byte is " + Byte.MAX_VALUE); // 127

    System.out.println("The max value of float is " + Float.MAX_VALUE); // 3.4028235E38
    System.out.println("The minimum of float is " + Float.MIN_VALUE); // 1.4E-45

    System.out.println("The max value of double is " + Double.MAX_VALUE); // 1.7976931348623157E308
    System.out.println("The minimum of double is " + Double.MIN_VALUE); // 4.9E-324
    // ==============================================================================================================
    String a = "Dara is a good man";
    String b = " and handsome";
    String f = "";
    String c = a.toUpperCase();
    String d = a.toLowerCase();
    System.out.println("Uppercase string : " + c); // DARA IS A GOOD MAN
    System.out.println("Lowercase string : " + d); // dara is a good man
    System.out.println("Length of string : " + a.length()); // 18
    System.out.println(a.charAt(1)); // a
    System.out.println(a.trim()); // Dara is a good man
    System.out.println(a.compareTo(b));// 36
    System.out.println(a.concat(b)); // Dara is a good man and handsome
    System.out.println(f.isEmpty()); // false
    System.out.println(a.isBlank());
    // false, it can return true for the case f = " " that has space between this
    // holder.
    System.out.println(a.lastIndexOf('a')); // 16
    System.out.println(b.indexOf('h')); // 5

  }
}
