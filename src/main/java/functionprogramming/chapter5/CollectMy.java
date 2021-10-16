package functionprogramming.chapter5;

import functionprogramming.music.Album;
import functionprogramming.music.Artist;
import functionprogramming.music.SampleData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

@Slf4j
class CollectMyOne {

    public static void main(String[] args) {
        Optional<Artist> artists = biggestGroup(SampleData.threeArtists());
        log.info("artists: " + artists.get());

        double averageTrack = averageNumberOfTrack(SampleData.albums);
        log.info("average track " + averageTrack);

        Map<Boolean, List<Artist>> bandsAndSolo = bandsAndSolo(SampleData.threeArtists());
        log.info("albums " + bandsAndSolo);

        //Map<Artist, List<Album>> albumsByArtist = albumsByArtist(SampleData.albums);
        //log.info("Albums by Artist: " + albumsByArtist);

//    Map<Artist, Long> counting = numberOfAlbum(SampleData.albums);
//    log.info("counting: " + counting);
    }

    public static Optional<Artist> biggestGroup(Stream<Artist> artists) {
        Function<Artist, Long> getCount = artist -> artist.getMembers().count();
        return artists.collect(Collectors.maxBy(Comparator.comparing(getCount)));
    }

    public static double averageNumberOfTrack(Stream<Album> albums) {
        return albums
                .collect(Collectors.averagingDouble(album -> album.getTrackList().size()));
    }

    public static Map<Boolean, List<Artist>> bandsAndSolo(Stream<Artist> artists) {
        return artists.collect(Collectors.partitioningBy(Artist::isSolo));
    }

    public static Map<Artist, List<Album>> albumsByArtist(Stream<Album> albums) {
        return albums.collect(Collectors.groupingBy(Album::getMainMusician));
    }

    public static Map<Artist, Long> numberOfAlbum(Stream<Album> albums) {
        return albums.collect(Collectors.groupingBy(Album::getMainMusician, Collectors.counting()));
    }
}

@Slf4j
class CollectorCustom {
    public static void main(String[] args) {
        String result = SampleData.threeArtists()
                .map(Artist::getName)
                .collect(Collectors.reducing(
                        new StringCombiner(", ", "[", "]"),
                        name -> new StringCombiner(", ", "[", "]")
                                .add(name),
                        StringCombiner::merge))
                .toString();

        log.info(result);
    }
}
