/*
Реализуйте приложение, которое имеет макет границы и надписи для каждой области в макете.

        События мыши для описания действий:

        a. Когда мышь входит в CENTER, программа показывает диалоговое окно (Добро пожаловать в [придумайте своё наименование]);

        b. Когда мышь входит в WEST, программа показывает диалоговое окно (Добро пожаловать в [придумайте своё наименование]);

        c. Когда мышь входит в SOUTH, программа показывает диалоговое окно (Добро пожаловать в [придумайте своё наименование]);

        d. Когда мышь входит в в NORTH, программа показывает диалоговое окно (Добро пожаловать в [придумайте своё наименование]);

        e. Когда мышь входит в EAST, программа показывает диалоговое окно (Добро пожаловать в [придумайте своё наименование]).
*/


package task2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Окно
        JFrame box = new JFrame("Макет границы");


        //Счёт
        JLabel center = new JLabel("CENTER");
        center.setBounds(110, 100, 100, 50);
        center.setToolTipText("Добро пожаловать в Найт-Сити");

        JLabel left = new JLabel("WEST");
        left.setBounds(0, 100, 100, 50);
        left.setToolTipText("Добро пожаловать в Новиград");

        JLabel right = new JLabel("EAST");
        right.setBounds(250, 100, 100, 50);
        right.setToolTipText("Добро пожаловать в Восторг");

        JLabel top = new JLabel("NORTH");
        top.setBounds(110, 0, 100, 50);
        top.setToolTipText("Добро пожаловать в Аркадия Бэй");

        JLabel bottom = new JLabel("SOUTH");
        bottom.setBounds(110, 200, 100, 50);
        bottom.setToolTipText("Добро пожаловать в Заун");

        //Добавление элеметов в окно
        box.add(center);
        box.add(left);
        box.add(right);
        box.add(top);
        box.add(bottom);

        box.setSize(300, 300);
        box.setLayout(null);
        box.setVisible(true);
    }
}
