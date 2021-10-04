package amigocode;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

  public static void main(String[] args) {
    System.out.println(getDBConnectionsUrl());
    System.out.println(getDBConnectionsUrlsSupplier.get());
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
