package Task2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Окно
        JFrame box = new JFrame("Макет границы");


        //Счёт
        JLabel center = new JLabel("CENTER");
        center.setBounds(110, 100, 50, 50);




        //Добавление элеметов в окно
        box.add(center);
        box.setSize(300, 300);
        box.setLayout(null);
        box.setVisible(true);
    }
}
