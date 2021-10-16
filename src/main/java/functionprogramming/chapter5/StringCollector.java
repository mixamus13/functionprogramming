package functionprogramming.chapter5;

import lombok.Data;

import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

@Data
public class StringCollector implements Collector<String, StringCombiner, String> {

    private static final Set<Characteristics> characteristics = Collections.emptySet();

    private final String delim;
    private final String prefix;
    private final String suffix;

    @Override
    public Supplier<StringCombiner> supplier() {
        return () -> new StringCombiner(delim, prefix, suffix);
    }

    @Override
    public BiConsumer<StringCombiner, String> accumulator() {
        return StringCombiner::add;
    }

    @Override
    public BinaryOperator<StringCombiner> combiner() {
        return StringCombiner::merge;
    }

    @Override
    public Function<StringCombiner, String> finisher() {
        return StringCombiner::toString;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return characteristics;
    }
}
