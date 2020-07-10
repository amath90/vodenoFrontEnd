package Utils.TestData;

public class TestDataHolder extends TestData {

    public TestDataHolder() {
        final TestDataGenerator testDataGenerator = new TestDataGenerator();
        firstName = testDataGenerator.provideFirstName();
        lastName = testDataGenerator.provideLastName();
        email = testDataGenerator.provideEmail();
        city = testDataGenerator.provideCity();
        firstAddress = testDataGenerator.provideFirstAddress();
        zipCode = testDataGenerator.provideZipCode();
        phoneNumber = testDataGenerator.provideMobileNumber();
    }
}
