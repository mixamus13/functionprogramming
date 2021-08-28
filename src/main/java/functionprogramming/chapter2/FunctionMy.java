package functionprogramming.chapter2;

import java.util.function.Function;

/**
 * Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R:
 */
public class FunctionMy {

  public static void main(String[] args) {
    Function<Integer, Integer> add = (a) -> a + 1;
    System.out.println("add.apply(10) = " + add.apply(1255));

    Function<Integer, String> convert = x -> x + " dollars";
    System.out.println("convert.apply(100) = " + convert.apply(100));
  }

}
