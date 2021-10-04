package amigocode;

import java.util.function.Predicate;
import lombok.NonNull;

public class _Predicate {

  public static void main(String[] args) {
    System.out.println(isPhoneNumberValid("07000000000"));
    System.out.println(isPhoneNumberValid("0700000000"));
    System.out.println(isPhoneNumberValid("32024004400"));

    System.out.println("isPhoneNumberValidPredicate = " + isPhoneNumberValidPredicate.test("07000000000"));
    System.out.println("isPhoneNumberValidPredicate = " + isPhoneNumberValidPredicate.test("040000000"));
    System.out.println("isPhoneNumberValidPredicate = " + isPhoneNumberValidPredicate.test("0700000000"));

    System.out.println("and or --> " + isPhoneNumberValidPredicate.and(containsNumber3).test("07004000080"));
  }

  static boolean isPhoneNumberValid(@NonNull String phoneNumber) {
    return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
  }

  static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
      phoneNumber.startsWith("07") && phoneNumber.length() == 11;

  static Predicate<String> containsNumber3 = phoneNumber ->
      phoneNumber.contains("3");
}
