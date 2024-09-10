package edu.grinnell.csc207.util;

/**
 * Simple counters.
 *
 * Cade Johnston, Ben Sheeley
 */
public class Counter {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  int count;
  
  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  
  public Counter() {
    count = 0;
  }

  public Counter(int start) {
    count = start;
  }
  
  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  public void increment(){
    this.count++;
  }

  public void decrement(){
    this.count--;
  }

  public void reset(){
    this.count=0;
  }

  public void set(int setter) {
    this.count = setter;
  }

  public int max(Counter a) {
    if(this.count >= a.count) {
      return this.count;
    }
    return a.count;
  }

  public int get(){
    return this.count;
  }

  public String toString(){
    return "["+this.count+"]";
  }
} // class Counter
