package functionprogramming.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MapMy {

  public static void main(String[] args) {
    List<String> collected = new ArrayList<>();
    for (String string : Arrays.asList("a", "b", "hello")) {
      String upperCase = string.toUpperCase();
      collected.add(upperCase);
    }
    log.info("Collected result " + collected);
  }

}

@Slf4j
// BUT BETTER
class MapNew {

  public static void main(String[] args) {
    List<String> collected = Stream.of("a", "b", "hello")
        .map(String::toUpperCase)
        .collect(Collectors.toList());
    log.info("Collected result with Stream API " + collected);
  }

}