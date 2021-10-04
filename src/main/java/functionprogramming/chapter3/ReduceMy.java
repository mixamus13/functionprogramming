package functionprogramming.chapter3;

import functionprogramming.music.Album;
import functionprogramming.music.Artist;
import functionprogramming.music.SampleData;
import functionprogramming.music.Track;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceMy {

  public static void main(String[] args) {
    Integer reduce = Stream.of(1, 3, 6, 13)
        .reduce(0, Integer::sum);
    System.out.println("reduce = " + reduce);

  }

}

class MusicMy {

  public static final List<Track> trackList = List.of(new Track("Mama", 70));
  public static final List<Artist> artistList = List.of(new Artist("Bob", "American"));
  public static final Album album = new Album("Faraday", trackList, artistList);
  public static final List<Album> albums = new ArrayList<>();

  public static void main(String[] args) {
    albums.add(album);
    System.out.println(findLongTracks(albums));
  }

  public static Set<String> findLongTracks(List<Album> albums) {
    Set<String> trackNames = new HashSet<>();
    albums.stream()
        .flatMap(Album::getTracks)
        .filter(track -> track.getLength() > 60)
        .map(Track::getName)
        .collect(Collectors.toSet());

    return trackNames;
  }
}