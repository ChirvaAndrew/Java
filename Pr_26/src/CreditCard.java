import java.util.HashMap;

public class CreditCard implements Payment{
    @Override
    public void pay(HashMap<String, Integer> bill) {
        System.out.println("Оплата проходит через карту");
        System.out.println("Ваш заказ:\n" + bill);
    }
}
