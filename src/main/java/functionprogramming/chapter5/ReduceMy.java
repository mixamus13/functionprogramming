package functionprogramming.chapter5;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReduceMy {

  public static void main(String... __) {
    OptionalInt reduce = IntStream.range(1, 21).reduce(Integer::sum);
    log.info("reduce int " + reduce);

    Double aDouble = Stream.of(4.34, 3.11, 5.19, 2.66)
        .reduce(0.00, Double::sum);
    log.info("aDoubles: " + aDouble);

  }

}
