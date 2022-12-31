//Создайте класс Автомобиль с реализацией анонимных и вложенных классов.
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Ford", "Mustang", 2018);
        myCar.start();

        myCar.drive(100, 50);

        Car.Engine engine = new Car.Engine(400);
        engine.rev();
    }
}