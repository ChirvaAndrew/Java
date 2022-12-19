public class Main {
    public static void main(String[] args) {
        int n = 12345;
        int result = reverse(n);
        System.out.println(result);
    }

    public static int reverse(int n) {
        if (n < 10) {
            return n;
        }
        return reverse(n / 10) * 10 + n % 10;
    }
}
