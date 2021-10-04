package functionprogramming.chapter3;

public class Outer {
  private int age = 42;

  class Inner {
    int example() {
      return age;
    }
  }
}
