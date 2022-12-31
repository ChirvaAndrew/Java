public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(30, 61, 90);
            System.out.println("Угол 1: " + triangle.getAngle1());
            System.out.println("Угол 2: " + triangle.getAngle2());
            System.out.println("Угол 3: " + triangle.getAngle3());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}