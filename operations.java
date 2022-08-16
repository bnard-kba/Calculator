//operations class that contains all methods of the calculator

public class operations {
  /**
   * @param x - an integer
   * @param y - an integer
   * @return - the sum of the two integers
   */
  public static int add(String x, String y) {
    return Integer.parseInt(x) + Integer.parseInt(y);
  }

  /**
   * @param x - an integer
   * @param y - an integer
   * @return - the difference of the two integers
   */
  public static int subtract(String x, String y) {
    return Integer.parseInt(x) - Integer.parseInt(y);
  }

  /**
   * 
   * @param x - an integer
   * @param y - an integer
   * @return - the product of the two integers
   */
  public static int multiply(String x, String y) {
    return Integer.parseInt(x) * Integer.parseInt(y);
  }

  /**
   * 
   * @param x - an integer
   * @param y - an integer
   * @return - the quotient of the two integers
   */
  public static int divide(String x, String y) {
    return Integer.parseInt(x) / Integer.parseInt(y);
  }

  /**
   * 
   * @param x - an integer
   * @param y - an integer
   * @return - the remainder after dividing the two integers
   */
  public static int modulo(String x, String y) {
    return Integer.parseInt(x) % Integer.parseInt(y);
  }

  /**
   * 
   * @param x - an integer
   * @param y - an integer
   * @return - the result of the exponent of the second integer on the first
   */
  public static double exponent(String x, String y) {
    return Math.pow(Double.parseDouble(x), Double.parseDouble(y));
  }
}
