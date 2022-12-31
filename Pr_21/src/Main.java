// Создайте класс со списком линий метро.
// Класс включает в себя метод, который называется PrintList с логическим параметром.
// Метод выводит на консоль нечетные или четные элементы списка, в зависимости от величины параметра (true или false)

public class Main {
    public static void main(String[] args) {
        MetroLines metro = new MetroLines();
        System.out.println("true:");
        metro.printList(true); // prints even elements
        System.out.println("false:");
        metro.printList(false); // prints odd elements
    }
    }
