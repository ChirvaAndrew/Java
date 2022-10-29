import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame a = new JFrame("Example");
        JButton b = new JButton("Click me");
        b.setBounds(40,90,85,20);
        a.add(b);
        a.setSize(300,300);
        a.setLayout(null);
        a.setVisible(true);
    }
}