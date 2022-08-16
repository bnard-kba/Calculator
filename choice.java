// choice class that contains the main functionality of starting the program

import java.util.*;

public class choice {

  public static void start() {
    Scanner sc = new Scanner(System.in);

    /*
     * Inputting the two integers and performing checks using
     * try catch block to make sure that they are integers.
     * If they are not, print "invalid integer" message and exit program
     */
    System.out.println("Input the first number: ");
    String inp1 = sc.next();

    try {
      Integer.parseInt(inp1);
    } catch (NumberFormatException nfe) {
      System.out.println(inp1 + " is not an integer!");
      System.exit(1);
    }

    System.out.println("Input the second number: ");
    String inp2 = sc.next();

    try {
      Integer.parseInt(inp2);
    } catch (NumberFormatException nfe) {
      System.out.println(inp2 + " is not an integer!");
      System.exit(1);
    }

    System.out.println("""
        Which operation would you like to perform?
        1: add
        2: subtract
        3: multiply
        4: divide:
        5: remainder
        6: exponent
        """);

    /*
     * Input of operation choice and
     * switch statement for respective selection
     */
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("Result: " + operations.add(inp1, inp2));
        break;
      case 2:
        System.out.println("Result: " + operations.subtract(inp1, inp2));
        break;
      case 3:
        System.out.println("Result: " + operations.multiply(inp1, inp2));
        break;
      case 4:
        System.out.println("Result: " + operations.divide(inp1, inp2));
        break;
      case 5:
        System.out.println("Result: " + operations.modulo(inp1, inp2));
        break;
      case 6:
        System.out.println("Result: " + (int) operations.exponent(inp1, inp2));
        break;

      default:
        System.out.println("Enter a valid choice.");
        break;
    }
    sc.close();
  }
}
