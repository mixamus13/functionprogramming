package functionprogramming.chapter5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class MethodReferenceTest {

  @Test
  void getSetOrder() {
    Set<Integer> numbers = new HashSet<>(Arrays.asList(4, 3, 2, 1));
    List<Integer> sameOrder = numbers.stream()
        .sorted()
        .collect(Collectors.toList());

    assertEquals(Arrays.asList(1, 2, 3, 4), sameOrder);
  }

  @Test
  void getMapOrdered() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    List<Integer> stillOrdered = numbers.stream()
        .map(x -> x + 1)
        .collect(Collectors.toList());

    assertEquals(Arrays.asList(2, 3, 4, 5), stillOrdered);

    Set<Integer> unordered = new HashSet<>(numbers);
    List<Integer> stillUnordered = unordered.stream()
        .map(x -> x + 1)
        .collect(Collectors.toList());

  }
}
