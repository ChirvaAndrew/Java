import org.junit.Test;
import static org.junit.Assert.*;

public class CurrencyInfoTest {
    @Test
    public void testSetName() {
        CurrencyInfo currencyInfo = new CurrencyInfo();
        currencyInfo.setName("US Dollar");
        assertEquals("US Dollar", currencyInfo.getName());
    }

    @Test
    public void testSetSymbol() {
        CurrencyInfo currencyInfo = new CurrencyInfo();
        currencyInfo.setSymbol("$");
        assertEquals("$", currencyInfo.getSymbol());
    }

    @Test
    public void testSetExchangeRate() {
        CurrencyInfo currencyInfo = new CurrencyInfo();
        currencyInfo.setExchangeRate(1.0);
        assertEquals(1.0, currencyInfo.getExchangeRate(), 0.001);
    }
}
