package amigocode;

import java.util.function.Predicate;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class _Predicate {

  public static void main(String[] args) {
    log.info("isPhoneNumberValid " + isPhoneNumberValid("07000000000"));
    log.info("isPhoneNumberValid " + isPhoneNumberValid("0700000000"));
    log.info("isPhoneNumberValid " + isPhoneNumberValid("32024004400"));

    log.info("isPhoneNumberValidPredicate = " + isPhoneNumberValidPredicate.test("07000000000"));
    log.info("isPhoneNumberValidPredicate = " + isPhoneNumberValidPredicate.test("040000000"));
    log.info("isPhoneNumberValidPredicate = " + isPhoneNumberValidPredicate.test("0700000000"));

    log.info("and or --> " + isPhoneNumberValidPredicate.and(containsNumber3).test("07004000080"));
  }

  static boolean isPhoneNumberValid(@NonNull String phoneNumber) {
    return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
  }

  static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
      phoneNumber.startsWith("07") && phoneNumber.length() == 11;

  static Predicate<String> containsNumber3 = phoneNumber ->
      phoneNumber.contains("3");
}
