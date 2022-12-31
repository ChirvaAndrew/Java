// Реализуйте класс Абстрактная фабрика для различных типов стульев: Викторианский стул, Многофункциональный стул, Магический стул,
// а также интерфейс Стул, от которого наследуются все классы стульев,
// и класс Клиент, который использует интерфейс стул в своем методе Sit (Chair chair).


import java.util.HashMap;

public class Main {
    private static final HashMap<String, ChairFactory> factories = new HashMap<>();

    static {
        factories.put("Victorian", new VictorianChairFactory());
        factories.put("Multifunctional", new MultifunctionalChairFactory());
        factories.put("Magic", new MagicChairFactory());
    }

    public static void main(String[] args) {
        Client client = new Client();
        for (String chairType : factories.keySet()) {
            client.sit(factories.get(chairType).createChair());
        }
    }
}