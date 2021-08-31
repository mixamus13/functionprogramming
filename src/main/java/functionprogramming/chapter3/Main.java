package functionprogramming.chapter3;

import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

public class Main {

  public static void main(String[] args) {
    List<Track> tracks = List.of(
        new Track("Bakai", 524),
        new Track("Violets for Your Furs", 378),
        new Track("Time was", 451)
    );

    Track shortTrack = tracks.get(0);
    for (Track track : tracks) {
      if (track.getLength() < shortTrack.getLength()) {
        shortTrack = track;
      }
    }
    System.out.println("<==========> " + shortTrack);
  }

  @Data
  @AllArgsConstructor
  static class Track {

    private String name;
    private int length;
  }
}
