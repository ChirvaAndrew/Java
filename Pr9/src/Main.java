import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Team first = new Team("Милан");
        Team second = new Team("Мадрид");
        JFrame box = new JFrame("Матч");
        JButton firstTeam = new JButton(first.getName());
        firstTeam.setBounds(20, 15, 85, 20);
        firstTeam.addActionListener(e -> click(1, first, second, box));
        JButton secondTeam = new JButton(second.getName());
        secondTeam.setBounds(150, 15, 85, 20);
        secondTeam.addActionListener(e -> click(2, first, second, box));
        JLabel result = new JLabel(first.getScore() + " X " + second.getScore());
        result.setBounds(60, 60, 100, 100);
        box.add(result);
        box.add(firstTeam);
        box.add(secondTeam);
        box.setSize(300, 300);
        box.setLayout(null);
        box.setVisible(true);
    }

    static void click(int a, Team first, Team second, JFrame box, ) {
        if (a == 1) {
            first.click();
        }
        if (a == 2) {
            second.click();
        }
        result.
    }
}

