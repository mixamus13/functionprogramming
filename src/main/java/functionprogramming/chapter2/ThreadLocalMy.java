package functionprogramming.chapter2;

import java.text.SimpleDateFormat;
import java.util.function.Predicate;
import javax.swing.JButton;
import javax.swing.text.DateFormatter;

public class ThreadLocalMy {

  public final static ThreadLocal<DateFormatter> formatter =
      ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));

  public static void main(String[] args) {
    Runnable sayHello = () -> System.out.println(1313344);
    //sayHello.run();

//    JButton button = new JButton();
//    button.addActionListener(event ->
//        System.out.println(event.getActionCommand()));
  }

}
