import java.util.ArrayList;
import java.util.Scanner;

public class DogTest {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Dog> DogMass = new ArrayList<>();

    public void addDog() {
        boolean breakflag = false;
        while (true) {
            if (breakflag) break;
            else {
                System.out.println("Введите имя новой собаки(0 для выхода) >> ");
                String name = sc.next();
                if (name.equals("0")) {
                    breakflag = true;
                    break;
                }
                System.out.println("Введите возраст новой собаки >> ");
                int a = sc.nextInt();
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
