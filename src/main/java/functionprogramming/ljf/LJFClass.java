package functionprogramming.ljf;

import java.awt.Desktop;
import java.net.URI;
import java.net.URLEncoder;
import java.util.Map;
import lombok.val;
import org.atpfivt.ljv.LJV;

public class LJFClass {

  public static void main(String[] args) {
    browse(new LJV(), Map.of("one", 'a', "two", 'b', "three", 4, "four", "Max"));
  }

  public static void browse(LJV ljv, Object obj) {
    try {
      val dot = URLEncoder.encode(ljv.drawGraph(obj), "UTF8")
          .replaceAll("\\+", "%20");
      Desktop.getDesktop().browse(
          new URI("https://dreampuf.github.io/GraphvizOnline/#"
              + dot));
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

}
