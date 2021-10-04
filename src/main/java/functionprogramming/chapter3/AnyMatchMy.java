package functionprogramming.chapter3;

import static java.lang.System.out;

import java.util.List;

public class AnyMatchMy {

  public static void main(String[] args) {
    List<String> elements = List.of("Max", "Fer", "Viki", "Elen");
    boolean el = elements.stream()
        .anyMatch(s -> s.equals("Vikir"));

    out.println("el = " + el);

    elements.stream()
        .limit(3)
        .forEach(out::println);
  }

}
