//Реализуйте сравнение 5 объектов по hashCode() в Java, отобразите хеши и результаты сравнения на экране
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj1;
        Object obj4 = "string object";
        Object obj5 = 123;
        System.out.println("obj1 hashCode: " + obj1.hashCode());
        System.out.println("obj2 hashCode: " + obj2.hashCode());
        System.out.println("obj3 hashCode: " + obj3.hashCode());
        System.out.println("obj4 hashCode: " + obj4.hashCode());
        System.out.println("obj5 hashCode: " + obj5.hashCode());

        System.out.println("obj1 == obj2: " + (obj1 == obj2));
        System.out.println("obj1 == obj3: " + (obj1 == obj3));
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3));
        System.out.println("obj4.equals(obj5): " + obj4.equals(obj5));
    }
}
