package functionprogramming.chapter2.callback;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Lambdas {

  public static void main(String[] args) {
    Runnable noArguments = () -> System.out.println("Hello World!!!");
    noArguments.run();

    ActionListener oneArgument = event -> System.out.println("button clocked");
    ActionEvent event = new ActionEvent(new Object(), 10, "command");
    oneArgument.actionPerformed(event);

    BinaryOperator<Long> add = (x, y) -> x / y;
    System.out.println("add.apply( / ) = " + add.apply(332213232L, 1229332L));

    Runnable multyStatement = () -> {
      System.out.println("Hi");
      System.out.println("MAX");
    };

    multyStatement.run();

    Predicate<Integer> predicate = p -> p > 5;
    System.out.println("predicate.test(3) = " + predicate.test(13));
    System.out.println("predicate.negate() = " + predicate.negate());

    BinaryOperator<Long> binaryOperator = (a, b) -> a / b;
    System.out.println("binaryOperator.apply(12, 56) = " + binaryOperator.apply(1234L, 56L));
  }

}
