import java.util.HashMap;

public class OnlineWallet implements Payment{

    @Override
    public void pay(HashMap<String, Integer> bill) {
        System.out.println("Проходит оплата через кошелек");
        System.out.println("Ваш заказ:\n" + bill);
    }
}
