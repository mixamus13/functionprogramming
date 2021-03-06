package functionprogramming.music;

import static java.util.stream.Stream.concat;

import java.util.stream.Stream;

public interface Performance {

  public String getName();

  public Stream<Artist> getMusicians();

  // TODO: test
  default Stream<Artist> getAllMusicians() {
    return getMusicians().flatMap(artist -> {
      return concat(Stream.of(artist), artist.getMembers());
    });
  }

}
