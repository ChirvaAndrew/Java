public class Car implements Driveable {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Двигатель запущен!");
    }

    // Анонимный класс
    public void drive(int distance, int speed) {
        Driveable drive = new Driveable() {
            @Override
            public void drive(int distance, int speed) {
                System.out.println("Путь в " + distance + " километров со скоростью " + speed + " кмч.");
            }
        };
        drive.drive(distance, speed);
    }

    // Вложенный класс
    public static class Engine {
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public void rev() {
            System.out.println("Мощность двигателя равна " + horsepower + " лс");
        }
    }
}


