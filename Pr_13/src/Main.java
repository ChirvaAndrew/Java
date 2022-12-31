import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // создаем экземпляр коллекции ArrayList
        System.out.println("ArrayList:");
        ArrayList<Integer> numbers = new ArrayList<>();

        // добавляем элементы в коллекцию
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // выводим размер коллекции
        System.out.println("Size: " + numbers.size());

        // выводим элементы коллекции
        for (int number : numbers) {
            System.out.println(number);
        }

        // удаляем элемент из коллекции
        numbers.remove(1);

        // выводим размер коллекции после удаления элемента
        System.out.println("Size: " + numbers.size());


        // создаем экземпляр коллекции LinkedList
        System.out.println("\nLinkedList:");
        LinkedList<Integer> numbers2 = new LinkedList<>();
        // добавляем элементы в коллекцию
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);

        // выводим размер коллекции
        System.out.println("Size: " + numbers2.size());

        // выводим элементы коллекции
        for (int number : numbers2) {
            System.out.println(number);
        }

        // удаляем элемент из коллекции
        numbers2.remove(1);

        // выводим размер коллекции после удаления элемента
        System.out.println("Size: " + numbers2.size());


        // создаем экземпляр коллекции MyArray
        System.out.println("\nMyArray:");
        MyArray<Integer> numbers3 = new MyArray<>();
        numbers3.add(1);
        numbers3.add(2);
        numbers3.add(3);

        // выводим размер коллекции
        System.out.println("Size: " + numbers3.size());

        // выводим элементы коллекции
        for (int i = 0; i < numbers3.size(); i++)
        {
            System.out.println(numbers3.get(i));
        }

        // удаляем элемент из коллекции
        numbers3.remove(1);

        // выводим размер коллекции после удаления элемента
        System.out.println("Size: " + numbers3.size());
    }
}