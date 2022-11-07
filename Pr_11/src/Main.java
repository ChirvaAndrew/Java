//import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        Counter attemt = new Counter(0);
        //Генерация случайного числа
        int rnd = (int) (Math.random() * 20.);
        System.out.println(rnd);

        //Окно
        JFrame box = new JFrame("игра-угадайка");


        JLabel greeting = new JLabel("Вам нужно угадать число от 0 до 20");
        greeting.setBounds(0, 0, 2000, 15);
        JTextArea enter = new JTextArea();
        enter.setBounds(120, 100, 30, 20);

        JLabel counter = new JLabel("Счётчик попыток " + attemt.getAttemt() + "/3");
        counter.setBounds(0, 25, 200, 15);

        JLabel output = new JLabel("Пока не было попыток. Удачи!");
        output.setBounds(70, 160, 2000, 30);


        JButton submit = new JButton("подтвердить");
        submit.setBounds(70, 140, 130, 20);
        submit.addActionListener(e -> click(enter, rnd, attemt, output, counter, submit));


        box.add(enter);
        box.add(greeting);
        box.add(counter);
        box.add(submit);
        box.add(output);
        box.setSize(400, 300);
        box.setLayout(null);
        box.setVisible(true);
        //System.out.println(i);
    }

    static void click(JTextArea enter, int rnd, Counter attemt, JLabel output, JLabel counter, JButton submit) {

        attemt.up();
        System.out.println(enter.getText());
        if (!Objects.equals(enter.getText(), "") && Integer.parseInt(enter.getText()) == rnd) {
            output.setText("Верно!");
            submit.setVisible(false);
        }
        if (!Objects.equals(enter.getText(), "") && Integer.parseInt(enter.getText()) > rnd) {
            output.setText("Нет, загаданное число меньше");
            enter.setText(null);
        }

        if (!Objects.equals(enter.getText(), "") && Integer.parseInt(enter.getText()) < rnd) {
            output.setText("Нет, загаданное число больше");
            enter.setText(null);
        }
        counter.setText("Счётчик попыток " + attemt.getAttemt() + "/3");

        if (attemt.getAttemt() == 3 && Integer.parseInt(enter.getText()) != rnd)
        {
            output.setBounds(0, 160, 2000, 30);
            output.setText("Нет. Вы исчерпали количество попыток.\n загаданное число: " + rnd);
            submit.setVisible(false);
        }
    }


}

