package functionprogramming.chapter3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMy {

  public static void main(String... args) {

    List<Integer> together = Stream.of(
            Arrays.asList(43, 11, 3, 4),
            Arrays.asList(12, 543, 23, 90),
            Arrays.asList(34, 66, 124))
        .flatMap(Collection::parallelStream)
        .collect(Collectors.toList());
    System.out.println("together = " + together);

    List<Integer> min = Stream.of(
            Arrays.asList(43, 11, 3, 4),
            Arrays.asList(12, 543, 23, 90),
            Arrays.asList(34, 66, 124))
        .min(Comparator.comparing(List::isEmpty))
        .get();
    System.out.println("min = " + min);
  }
}
