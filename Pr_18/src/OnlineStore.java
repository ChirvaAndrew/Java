import java.util.HashMap;
import java.util.Scanner;

public class OnlineStore {
    public static HashMap<String, String> dataBase = new HashMap<String, String>();

    public void fill() throws Exception {
        dataBase.put("123456", "Иванов И.И.");
        dataBase.put("311222", "Сидоров С.С.");
        dataBase.put("200302", "Чирва А.Ю.");
        dataBase.put("678900", "Неиванов Н.Н.");
    }

    public void check(String inn) throws Exception {
        if (dataBase.get(inn) == null){
            throw new NullPointerException();
        }
        else {
            System.out.println("ИНН найден");
        }
    }

    public void add(String INN) throws Exception {
        try {
            check(INN);
            System.out.println("Спасибо за покупку,  " + dataBase.get(INN));
        } catch (NullPointerException e){
            System.out.println("Ваш ИНН не найден");
        }
    }

    public static void main(String[] args) throws Exception {
        OnlineStore RusOil = new OnlineStore();
        RusOil.fill();
        System.out.println("Введите ваш ИНН");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        RusOil.add(input);
    }
}

