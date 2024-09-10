package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.BigFraction;

import java.io.PrintWriter;

/**
 * A simple experiment using fractions.
 *
 * @author Samuel A. Rebelsky.
 * @author Cade Johnston, Ben Sheeley
 */
public class BFExperiment {
  /**
   * Generate a few fractions and print them out.
   *
   * @param args
   *   Command-line arguments; ignored.
   *
   * @throws Exception
   *   When we have some unexpected I/O issue.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BigFraction f1;
    f1 = new BigFraction(3, 10);
    BigFraction f2;
    f2 = new BigFraction(2, 5);
    pen.println("First fraction: " + f1);
    pen.println("Second fraction: " + f2);
    pen.println("Sum: " + (f1.add(f2)));
    pen.println("Product: " + (f1.multiply(f2)));
    BigFraction f;
    f = new BigFraction(11,3);
    pen.println(f.fractional());  // 2/3
    f = new BigFraction(1,2);
    pen.println(f.fractional());  // 1/2
    f = new BigFraction(5,2);
    pen.println(f.fractional());  // 1/2
    f = new BigFraction(4,2);
    pen.println(f.fractional());  // 0/2 or 0

    f = new BigFraction("1/4");
    pen.println(f.numerator());   // 1
    pen.println(f.denominator()); // 4
    f = new BigFraction("11/5");
    pen.println(f.numerator());   // 11
    pen.println(f.denominator()); // 5
    f = new BigFraction("120/3");
    pen.println(f.doubleValue()); // Approximately 40
    pen.close();
  } // main(String[])
} // class BFExperiment
