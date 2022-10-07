import java.util.Scanner; // импортируем класс
import java.util.Random;


public class pr1 {
    public static int Factorial(int number) {
        int ans = 1;
        for (int i = 2; i <= number; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Разработайте программу, в результате работы которой считается сумма элементов целочисленного массива с помощью циклов `for`, `while`, `do while`, результат выводится на экран.

        int massSize = 0;
        int a;
        boolean exit = false;
        while (true) {
            System.out.print("\nВыберите номер задания (1 - 5)\n0 для выхода\n>> ");
            a = sc.nextInt();
            switch (a) {
                case (1):
                    System.out.print("Введите размер массива >>");
                    massSize = sc.nextInt();
                    int[] mass = new int[massSize];
                    int summ = 0;
                    System.out.print("Введите массив >>");
                    for (int i = 0; i < massSize; i++) {
                        mass[i] = sc.nextInt();
                    }


                    //FOR
                    for (int i = 0; i < massSize; i++) {
                        summ += mass[i];
                    }
                    System.out.print("Сумма элементов массива = " + summ + "\n");


                    //WHILE
                    int counter = 0;
                    summ = 0;
                    while (counter < massSize) {
                        summ += mass[counter];
                        counter++;
                    }
                    System.out.print("Сумма элементов массива = " + summ + "\n");


                    //DO WHILE
                    counter = 0;
                    summ = 0;
                    do {
                        summ += mass[counter];
                        counter++;
                    }
                    while (counter < massSize);
                    System.out.print("Сумма элементов массива = " + summ + "\n");
                    break;
                case (2):
                    //Разработайте программу, в результате работы которой выводятся на экран аргументы командной строки в цикле `for`.
                    Scanner ch = new Scanner(System.in);
                    for (int i = 0; i < args.length; i++) {
                        System.out.println("Аргумент командной строки[" + i + "]=" + args[i]);
                    }
                    break;
                case (3):
                    //Разработайте программу, в результате работы которой выводятся на экран первые 10 чисел гармонического ряда (форматируйте вывод).
                    for (int i = 1; i < 11; i++) {
                        System.out.print(1.0 / i + "; ");
                    }
                    break;
                case (4):
        /*
        Разработайте программу, в результате работы которой генерируется массив целых чисел случайным образом,
        выведите его на экран, отсортируйте, и снова выведите на экран
        (используйте два подхода к генерации случайных чисел – метод random() класса Math и класс Random).
        */
                    //класс random
                    System.out.print("\nВведите размер массива >> ");
                    massSize = sc.nextInt();
                    int[] mass2 = new int[massSize];
                    for (int i = 0; i < massSize; i++) {
                        mass2[i] = rand.nextInt(1000);
                        System.out.print(mass2[i] + " ");
                    }

                    System.out.print("\n");

                    for (int i = 0; i < massSize - 1; i++) {
                        int min = mass2[i];
                        int minp = i;
                        for (int j = i + 1; j < massSize; j++) {
                            if (mass2[j] < min) {
                                min = mass2[j];
                                minp = j;
                            }
                        }
                        int temp = mass2[minp];
                        mass2[minp] = mass2[i];
                        mass2[i] = temp;
                    }
                    for (int i = 0; i < massSize; i++) {
                        System.out.print(mass2[i] + " ");
                    }
                    System.out.print("\n");


                    //Метод random() класса Math
                    for (int i = 0; i < massSize; i++) {
                        mass2[i] = (int) (Math.random() * 1000);
                        System.out.print(mass2[i] + " ");
                    }

                    System.out.print("\n");

                    for (int i = 0; i < massSize - 1; i++) {
                        int min = mass2[i];
                        int minp = i;
                        for (int j = i + 1; j < massSize; j++) {
                            if (mass2[j] < min) {
                                min = mass2[j];
                                minp = j;
                            }
                        }
                        int temp = mass2[minp];
                        mass2[minp] = mass2[i];
                        mass2[i] = temp;
                    }
                    for (int i = 0; i < massSize; i++) {
                        System.out.print(mass2[i] + " ");
                    }
                    break;
                case (5):
                    //Разработайте программу, которая будет с помощью метода вычислять факториал числа (используйте управляющую конструкцию цикла), проверьте работу метода.
                    System.out.println("Введите число, для которого необходимо вычислить факториал >> ");
                    int number = sc.nextInt();
                    System.out.println(Factorial(number));
                    break;
                case (0):
                    exit = true;
                    break;
            }
            if (exit) break;
        }
    }
}
