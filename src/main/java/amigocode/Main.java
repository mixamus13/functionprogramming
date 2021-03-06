package amigocode;

import static amigocode.Main.Gender.*;
import static amigocode.Main.Gender.MALE;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.ToString;

public class Main {

  public static void main(String... args) {

    List<Person> people = List.of(
        new Person("John", MALE),
        new Person("Maria", FEMALE),
        new Person("Aisha", FEMALE),
        new Person("Alex", MALE),
        new Person("Alice", FEMALE)
    );

    System.out.println("Imperative approach");
    //Imperative approach
    List<Person> females = new ArrayList<>();
    for (Person person : people) {
      if (FEMALE.equals(person.gender)) {
        females.add(person);
      }
    }

    for (Person female : females) {
      System.out.println(female);
    }

    System.out.println();
    System.out.println("Declarative approach");

    // Declarative approach
    Predicate<Person> personPredicate = person -> MALE.equals(person.gender);

    List<Person> personList = people.stream()
        .filter(personPredicate)
        .collect(Collectors.toList());
    personList.forEach(System.out::println);
  }

  @AllArgsConstructor
  @ToString
  static class Person {

    private final String name;
    private final Gender gender;
  }

  enum Gender {
    MALE, FEMALE
  }
}
