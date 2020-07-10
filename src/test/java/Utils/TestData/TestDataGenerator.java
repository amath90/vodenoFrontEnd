package Utils.TestData;

import java.util.Random;

import static org.apache.commons.lang3.RandomStringUtils.*;

class TestDataGenerator {

    private static final int randomCityNameLength = 15;
    private static final int randomAddressNameLength = 30;

    String provideFirstName() {
        return "FN" + randomAlphabetic(4);
    }

    String provideLastName() {
        return "LN" + randomAlphabetic(6);
    }

    String provideEmail() {
        return "email" + randomAlphanumeric(6) + "@testdata.com";
    }

    String provideCity() {
        return "City" + randomAlphanumeric(randBetween(randomCityNameLength));
    }

    String provideFirstAddress() {
        return "Address: " + randomAlphanumeric(randBetween(randomAddressNameLength));
    }

    String provideZipCode() {
        return randomNumeric(5);
    }

    String provideMobileNumber() {
        return randomNumeric(14);
    }

    private static Integer randBetween(final int end) {
        final Random r = new Random();
        return r.nextInt((end) + 1);
    }


}
