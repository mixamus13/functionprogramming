package functionprogramming.chapter3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class CollectMyTest {

  @Test
  void getCollectList() {
    List<String> collected = Stream.of("a", "f", "d", "w")
        .collect(Collectors.toList());
    System.out.println("collected = " + collected);

    assertEquals(Arrays.asList("a", "f", "d", "w"), collected);
  }

}