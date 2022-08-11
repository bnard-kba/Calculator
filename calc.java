import java.util.Scanner;

public class calc {


  // public static boolean isNumber(String s1, String s2) {
  //   if (s1.isEmpty() || s2.isEmpty()) {
  //     return false;
  //   }
  //   try {
  //     int num1 = Integer.parseInt(s1);
  //     int num2 = Integer.parseInt(s2);
  //   } 
  //   catch (NumberFormatException nfe) {
  //     System.out.println("This is not a number!");
      
  //     throw nfe;
      
  //   }
  //   return true;
  // }

  /**
   * @param x
   * @param y
   * @return
   */
  public static int add(int x, int y) {
    return x + y;
  }

  public static int subtract(int x, int y) {
    return x - y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static int divide(int x, int y) {
    return x / y;
  }

  public static int remainder(int x, int y) {
    return x % y;
  }

  public static double cubed(double x, double y) {
    return Math.pow(x, y);
  }




  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two numbers please: ");

    // int n1 = sc.nextInt();
    // int n2 = sc.nextInt();
    double n1 = sc.nextDouble();
    double n2 = sc.nextDouble();
    // isNumber(n1, n2);
    
    // System.out.println(add(num1, num2));
    // System.out.println((int)cubed(n1,n2));
    sc.close();
  }
}