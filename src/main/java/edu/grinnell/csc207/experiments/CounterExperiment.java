package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.Counter;

import java.io.PrintWriter;

/**
 * Experiments with Counters.
 *
 * @author Cade Johnston, Ben Sheeley
 */
public class CounterExperiment {
  /**
   * Run some experiments on counters.
   *
   * @param args
   *   Command-line arguments
   *
   * @throws Exception
   *   If something goes unexpectedly wrong
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    Counter counterA = new Counter();
    Counter counterB = new Counter();
    pen.println("Exercise 5");
    pen.println("counterA: " + counterA.get());
    pen.println("counterB: " + counterB.get());
    counterA.increment();
    pen.println("counterA: " + counterA.get());
    pen.println("counterB: " + counterB.get());
    pen.println("Exercise 6");
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    c1.increment();
    c1.increment();
    c2.increment();
    pen.println("c1: " + c1);
    pen.println("c2: " + c2);
    pen.println("Exercise 7");
    Counter c3 = new Counter(5);
    pen.println("c3: " + c3.get());
    c3.reset();
    pen.println("c3: " + c3.get());
    pen.close();
  } // main(String[])
} // class CounterExperiment
