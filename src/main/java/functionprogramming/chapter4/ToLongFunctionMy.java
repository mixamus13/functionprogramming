package functionprogramming.chapter4;

import functionprogramming.music.Album;
import functionprogramming.music.SampleData;
import functionprogramming.music.Track;
import java.util.IntSummaryStatistics;
import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ToLongFunction;

public class ToLongFunctionMy {

  public static void main(String[] args) {

    printTrackLengthStatistics(SampleData.aLoveSupreme);
  }

  public static void printTrackLengthStatistics(Album album) {
    IntSummaryStatistics trackLengthStats =
        album.getTracks()
            .mapToInt(Track::getLength)
            .summaryStatistics();

    System.out.printf("Max: %d, Min: %d, Ave: %f, Sum: %d",
        trackLengthStats.getMax(),
        trackLengthStats.getMin(),
        trackLengthStats.getAverage(),
        trackLengthStats.getSum());
  }
}
