//Напишите код, который формирует объекты Date и Calendar по следующим данным,
// вводимым пользователем: <Год><Месяц><Число> <Часы><Минуты>
//Напишите программу, выводящую фамилию разработчика, дату и время получения задания,
// а также дату и время сдачи задания. Для получения последней даты и времени
// используйте класс Date из пакета java.util.* (Объявление Dated=newDate() или метод System.currentTimeMillis().


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        System.out.println("Введите год, месяц, число, часы, минуты через пробел: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute);
        Date date = calendar.getTime();
        System.out.println("Сформированная дата: " + date);


        //2
        String developerName = "Андрей Чирва";
        Date taskReceivedDate = new Date(122, 8, 1);
        Date taskSubmittedDate = new Date(122, 11, 31);
        System.out.println("Developer name: " + developerName);
        System.out.println("Task received date: " + taskReceivedDate);
        System.out.println("Task submitted date: " + taskSubmittedDate);


    }
}