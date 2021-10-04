package functionprogramming.chapter4;

public interface Child extends Parent {

  @Override
  default void welcome() {
    message("Child: Hi1");
  }
}
