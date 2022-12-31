import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для записи в файл: ");
        String input = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Вывод: ");
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.print("Введите текст для перезаписи в файл: ");
        input = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", false))) {
            writer.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Вывод: ");
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.print("Введите текст для перезаписи в файл: ");
        input = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
            writer.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Вывод: ");
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
