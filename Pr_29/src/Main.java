//Создайте класс CurrencyInfo с сериализацией.

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        CurrencyInfo currencyInfo = new CurrencyInfo();
        currencyInfo.setName("US Dollar");
        currencyInfo.setSymbol("$");
        currencyInfo.setExchangeRate(1.0);

        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("currency.ser"))) {
            out.writeObject(currencyInfo);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
