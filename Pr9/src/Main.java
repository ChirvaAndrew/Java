import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Team first = new Team("Милан");
        Team second = new Team("Мадрид");

        //Окно
        JFrame box = new JFrame("Матч");


        //Счёт
        JLabel result = new JLabel("Result: " + first.getScore() + " X " + second.getScore());
        result.setBounds(5, 60, 100, 100);

        //Последняя забившая команда
        JLabel last = new JLabel("Last Scorer: N/A");
        last.setBounds(5, 80, 150, 100);

        //Победитель
        JLabel winner = new JLabel("Winner: DRAW");
        winner.setBounds(5, 100, 150, 100);

        //Кнопка первой команды
        JButton firstTeam = new JButton(first.getName());
        firstTeam.setBounds(20, 15, 85, 20);
        firstTeam.addActionListener(e -> click(1, first, second, result, last, winner));

        //Кнопка второй команды
        JButton secondTeam = new JButton(second.getName());
        secondTeam.setBounds(150, 15, 85, 20);
        secondTeam.addActionListener(e -> click(2, first, second, result, last, winner));


        //Добавление элеметов в окно
        box.add(result);
        box.add(firstTeam);
        box.add(secondTeam);
        box.add(last);
        box.add(winner);
        box.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        box.setSize(300, 300);
        box.setLayout(null);
        box.setVisible(true);
    }

    static void click(int a, Team first, Team second, JLabel box, JLabel last, JLabel winner) {
        if (a == 1) {
            first.click();
            last.setText("Last Scorer: " + first.getName());
        }
        if (a == 2) {
            second.click();
            last.setText("Last Scorer: " + second.getName());
        }
        box.setText("Result: " + first.getScore() + " X " + second.getScore());
        if (first.getScore() > second.getScore()) {
            winner.setText("Winner: " + first.getName());
        } else if (first.getScore() == second.getScore()) {
            winner.setText("Winner: DRAW");
        } else {
            winner.setText("Winner: " + second.getName());
        }
    }
}

