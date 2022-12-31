//Напишите программу, реализующую оплату в интернет-магазине.
// Использование паттерна Стратегия должно реализовать выбор платёжного метода в интернет-магазине.
// Когда пользователь сформировал заказ, он получает выбор из нескольких платёжных средств: электронного кошелька или кредитной карты.
// В данном случае конкретные стратегии платёжных методов не только проводят саму оплату, но и собирают необходимые данные в форме заказа.





import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class InternetStore {
    Scanner scanner = new Scanner(System.in);

        public String getProduct () {
        System.out.println("введите что вы хотите купить: ");
        return scanner.nextLine();
    }

    public int getPrice() {
        System.out.println("По какой цене?");

        return Integer.parseInt(scanner.nextLine());
    }

    public int getPayment() {
        while (true) {
            System.out.println("Какую платежную систему выберите?");
            System.out.println("1 - Онлайн кошелек");
            System.out.println("2 - Банковская карта");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Неверный выбор");
            }
        }
    }

    public void menu() {
        String product = getProduct();
        int price = getPrice();
        Client client = new Client();
        client.setBill(product, price);
        switch (getPayment()) {
            case 1 -> {
                OnlineWallet wallet = new OnlineWallet();
                wallet.pay(client.getBill());
            }
            case 2 -> {
                CreditCard card = new CreditCard();
                card.pay(client.getBill());
            }
        }
    }

    public static void main(String[] args) {
        InternetStore shop = new InternetStore();
        while (true) {
            shop.menu();
        }
    }
}
