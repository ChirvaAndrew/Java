//Примените тестирование в классах, созданных заранее.


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CurrencyInfoTest.class);
        if (result.wasSuccessful()) {
            System.out.println("Все тесты пройдены");
        } else {
            System.out.println("Тест провален" + result.getFailureCount());
            result.getFailures().forEach(failure -> {
                System.out.println(failure.getTestHeader() + ": " + failure.getMessage());
            });
        }
    }
}
