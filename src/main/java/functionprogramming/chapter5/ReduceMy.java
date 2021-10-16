package functionprogramming.chapter5;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;
import java.util.stream.Stream;

@Slf4j
public class ReduceMy {

    public static void main(String... __) {
        Integer reduce = Stream.of(4, 3, 5, 2).reduce(0, Integer::sum);
        log.info("reduce int " + reduce);

        Double aDouble = Stream.of(4.34, 3.11, 5.19, 2.66)
                .reduce(0.00, Double::sum);
        log.info("aDoubles: " + aDouble);

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму", "и", "не", "домыла");
        Optional<String> sentence = wordsStream.reduce((x, y) -> x + " " + y);
        log.info(sentence.get());
    }

}
