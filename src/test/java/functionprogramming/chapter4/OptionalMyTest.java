package functionprogramming.chapter4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OptionalMyTest {

  @DisplayName("Checking Optionale")
  @Test
  void getOption() {
    Optional<String> a = Optional.of("a");

    assertEquals("a", a.get());
    assertTrue(a.isPresent());
  }

  @Test
  void getOptionalIsEmpty() {
    Optional emptyOptional = Optional.empty();
    Optional alsoEmpty = Optional.ofNullable(null);
    Optional<String> b = Optional.of("b");
    Optional<String> c = Optional.of("c");

    assertFalse(emptyOptional.isPresent());

    assertEquals("b", emptyOptional.orElse("b"));
    assertEquals("с", emptyOptional.orElseGet(() -> "с"));
  }
}