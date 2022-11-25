public class Main {
    public static void main(String[] args) {
        DogTest test = new DogTest();
        test.addDog();
        Dog one = test.DogOut(0);
        System.out.println(one.getName() + " " + one.getAge());
        test.AllDogsOut();

    }
}
