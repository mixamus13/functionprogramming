package amigocode;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;

public class _Consumer {

  public static void main(String[] args) {
    Customer maria = new Customer("Maria", "+19094562313");

    //Normal Java function
    greetCustomer(maria);

    //ConsumerFunctional interface
    greetCustomerConsumer.accept(maria);

    greetCustomerConsumerV2.accept(maria, false);
  }

  static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
      (customer, showPhoneNumber) ->
          System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " +
              (showPhoneNumber ? customer.customerPhoneNumber : "*** *** ** **"));

  static Consumer<Customer> greetCustomerConsumer =
      customer ->
          System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " +
              customer.customerPhoneNumber);

  static void greetCustomer(Customer customer) {
    System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " +
        customer.customerPhoneNumber);
  }

  @AllArgsConstructor
  static class Customer {
    private final String customerName;
    private final String customerPhoneNumber;
  }
}
