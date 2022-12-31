//Составьте регулярное выражение, определяющее,является ли заданная строка IPv4-адресом, записанным в десятичном виде.
// – пример правильных выражений: 127.0.0.1, 255.255.255.0;
// – пример неправильных выражений: 1300.6.7.8, abc.def.gha.bcd.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);
        String[] testIPs = {"127.0.0.1", "255.255.255.0", "1300.6.7.8", "abc.def.gha.bcd"};

        for (String testIP : testIPs) {
            Matcher matcher = pattern.matcher(testIP);
            System.out.println(testIP + ": " + matcher.matches());
        }
    }
}