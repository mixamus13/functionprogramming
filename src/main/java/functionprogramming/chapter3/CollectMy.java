package functionprogramming.chapter3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMy {

  public static void main(String[] args) {
    List<String> collected = Stream.of("a", "f", "d", "w")
        .collect(Collectors.toList());

  }

}
