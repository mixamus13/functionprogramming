package functionprogramming.chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CollectMy {

  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>(Arrays.asList(45, 3, 8, 6, 87, 12));
    List<Integer> list = integerList.stream()
        .sorted()
        .collect(Collectors.toList());
    log.info("List sorted = " + list);

    List<Integer> listSimple = new ArrayList<>(Arrays.asList(23, 11, 567, 1, 2, 3, 4));
    Set<Integer> cor = new HashSet<>(listSimple);
    Collection<Integer> setIntegers = cor.stream()
        .map(integer -> integer + 1)
        .collect(Collectors.toCollection(TreeSet::new));
    log.info("set and plus one " + setIntegers);
  }

}
