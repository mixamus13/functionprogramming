package functionprogramming.chapter4;

public interface Parent {

  void message(String body);

  default void welcome() {
    message("Parent: Hi1");
  }

  String getLastMessage();

}

