public class Triangle {
    private double angle1;
    private double angle2;
    private double angle3;

    public Triangle(double angle1, double angle2, double angle3) throws Exception {
        if (angle1 + angle2 + angle3 != 180) {
            throw new Exception("Сумма углов треугольника не может быть больше 180 градусов");
        }
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }

    public double getAngle1() {
        return angle1;
    }

    public double getAngle2() {
        return angle2;
    }

    public double getAngle3() {
        return angle3;
    }
}
