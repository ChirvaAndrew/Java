public class TestBall {
    public TestBall() {
        Ball first = new Ball();
        Ball second = new Ball(1.0, 2.0);
        System.out.println(first.getX());
        System.out.println(second.getX());
        first.setX(25.1);
        System.out.println(first.getY());
        System.out.println(second.getY());
        first.setY(14.6);
        second.setXY(14.8, 79.6);
        System.out.println(first.toString());
        first.move(1.0, 2.0);
        System.out.println(first.toString());
    }
}
