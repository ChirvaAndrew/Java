/*
Реализуйте приложение с JTextArea и двумя меню:

        Цвет: предусмотрена возможность выбора одного из трёх заданных разработчиком цветов,

        Шрифт: предусмотрена возможность выбора одного из трёх заданных разработчиком шрифтов.

        Нужно написать программу, которая с помощью меню может изменять шрифт и цвет текста, написанного пользователем в JTextArea.
*/


package task3;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        //Окно
        JFrame box = new JFrame("Оборотень");

        //Поле для текста
        JTextArea textArea = new JTextArea();
        textArea.setBounds(0, 100, 400, 200);

        //Выпадающий список с цветом
        String[] colours = {"Чёрный", "Красный", "Зелёный", "Синий"};
        JComboBox colour = new JComboBox(colours);
        colour.setBounds(0, 0, 150, 20);

        //Выпадающий список с шрифтом
        String[] styles = {"Serif", "Arial", "Georgia", "Verdana"};
        JComboBox style = new JComboBox(styles);
        style.setBounds(0, 30, 150, 20);

        //кнопка
        JButton okButton = new JButton("Применить");
        okButton.setBounds(200, 20, 101, 20);
        okButton.addActionListener(e -> click(colour, style, textArea));


        box.add(okButton);
        box.add(style);
        box.add(textArea);
        box.add(colour);
        box.setSize(400, 300);
        box.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        box.setLayout(null);
        box.setVisible(true);
    }

    static void click(JComboBox colour, JComboBox style, JTextArea area) {
        int a = colour.getSelectedIndex();
        int b = style.getSelectedIndex();
        switch (a) {
            case (0):
                area.setForeground(Color.black);
                break;
            case (1):
                area.setForeground(Color.red);
                break;
            case (2):
                area.setForeground(Color.green);
                break;
            case (3):
                area.setForeground(Color.blue);
                break;
        }
        switch (b) {
            case (0):
                area.setFont(new Font("Serif", Font.CENTER_BASELINE, 14));
                break;
            case (1):
                area.setFont(new Font("Arial", Font.BOLD, 20));
                break;
            case (2):
                area.setFont(new Font("Georgia", Font.ITALIC, 25));
                break;
            case (3):
                area.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 28));
                break;
        }
    }
}

