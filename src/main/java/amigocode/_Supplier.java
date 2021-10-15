package amigocode;

import java.util.List;
import java.util.function.Supplier;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class _Supplier {

  public static void main(String[] args) {
    log.info(getDBConnectionsUrl());
    log.info(" " + getDBConnectionsUrlsSupplier.get());
  }

  static String getDBConnectionsUrl() {
    return "jdbc://localhost:5432/users";
  }

  static Supplier<List<String>> getDBConnectionsUrlsSupplier = ()
      -> List.of(
      "jdbc://localhost:5432/users",
      "jdbc://localhost:5432/orders",
      "jdbc://localhost:5432/shops"
  );
}
