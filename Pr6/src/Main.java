public class Main {
    public static void main(String[] args) {
        Human David = new Human();
        David.setName("David");
        Cat davidsCat = new Cat();
        davidsCat.setName("Basic");
        System.out.println(David.getName() + " and his cat " + davidsCat.getName());
        Car Porsche = new Car();
        Porsche.setPrice(9999);
        Porsche.setName("911");
        System.out.println(Porsche.getName() + " " + Porsche.getPrice());
    }
}