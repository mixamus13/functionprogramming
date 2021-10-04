package amigocode;

import java.util.function.Function;

public class _Function {

  public static void main(String[] args) {
    int increment = incrementByOne(1);
    System.out.println("increment = " + increment);

    Integer increment2 = incrementByOneFunction.apply(increment);
    System.out.println("increment2 = " + increment2);

    Integer multiply = multiplyBy10.apply(increment2);
    System.out.println("multiplyBy10 = " + multiply);

    Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
        incrementByOneFunction.andThen(multiplyBy10);
    addBy1AndThenMultiplyBy10.apply(1);
    System.out.println("addBy1AndThenMultiplyBy10 = " + addBy1AndThenMultiplyBy10);
  }

  static Function<Integer, Integer> incrementByOneFunction = integer -> integer + 1;

  static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

  static int incrementByOne(int number) {
    return number + 1;
  }
}
