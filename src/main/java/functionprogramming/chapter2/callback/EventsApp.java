package functionprogramming.chapter2.callback;

import javax.swing.JOptionPane;

public class EventsApp {

  public static void main(String[] args) {

    Button button = new Button(new ButtonClickHandler());
    button.click();
    button.click();
    button.click();
  }
}

class ButtonClickHandler implements EventHandler {

  public void execute() {

    System.out.println("Кнопка нажата!");
  }
}

interface EventHandler {

  void execute();
}

class Button {

  EventHandler handler;

  Button(EventHandler action) {

    this.handler = action;
  }

  public void click() {

    handler.execute();
  }
}

//=============================================================

class SomeClass {

  // создаем колбек и его метод
  interface Callback {

    void callingBack();
  }

  Callback callback;

  public void registerCallBack(Callback callback) {
    this.callback = callback;
  }

  void doSomething() {
    JOptionPane.showMessageDialog(null, "Выполняется работа");

    // вызываем метод обратного вызова
    callback.callingBack();
  }
}

class MyClass implements SomeClass.Callback {

  @Override
  public void callingBack() {

    System.out.println("Вызов метода обратного вызова");

  }
}

class Main {

  public static void main(String[] args) {
    SomeClass someClass = new SomeClass();
    MyClass myClass = new MyClass();

    //инициализируем колбек, передавая методу registerCallBack экземпляр MyClass, реализующий интерфейс колбек
    someClass.registerCallBack(myClass);
    someClass.doSomething();

  }
}