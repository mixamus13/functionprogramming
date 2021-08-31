package functionprogramming.chapter3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachMy {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Max");
    list.add("Bob");
    list.add("Elene");
    list.add("Dude");
    list.add("Jack");

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      String forList = iterator.next();
      System.out.println("forList ===> " + forList);
    }

    list.stream()
        .filter(s -> {
          System.out.println(s);
          return s.isEmpty();
        })
        .count();

  }

  //<R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner);

}
