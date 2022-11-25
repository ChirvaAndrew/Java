import java.util.ArrayList;
import java.util.Scanner;

public class DogTest {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Dog> DogMass = new ArrayList<>();

    public void addDog() {
        while (true) {
            System.out.println("1 (Или любой другой символ кроме нуля) - Добавить ещё собаку\n0 - Прекратить добавлять собак");
            int a = sc.nextInt();
            if (a == 0) break;
            else {
                System.out.println("Введите имя новой собаки >> ");
                String name = sc.next();
                System.out.println("Введите возраст новой собаки >> ");
                a = sc.nextInt();
                Dog newDog = new Dog(a, name);
                DogMass.add(newDog);
            }
        }

    }

    public Dog DogOut(int index) {
        return DogMass.get(index);
    }

    public void AllDogsOut() {
        for (int i = 0; i < DogMass.size(); i++) {
            System.out.println(i + " Имя: " + DogMass.get(i).getName() + " Возраст: " + DogMass.get(i).getAge());
        }
    }
}
