public class Main {
    public static void main(String[] args) {
        //Dish first = new Dish();
        Dish second = new Cup();
        Plate third = new Plate();
//        first.setDepth(12.1);
        second.setDepth(11.6);
        //third.setDepth(0.5);
//        System.out.println(first.getDepth() + " " + second.getDepth() + " " + third.getDepth());
        ((Cup) second).setVolume(0.5);
        third.setArea(11.0);
        //System.out.println(second.getVolume() + " " + third.getArea());
        Jug fourth = new Jug();
        //fourth.setVolume(2.1);
        fourth.setTransparent(true);
        //System.out.println(fourth.getVolume() + " " + fourth.getTransparent());
    }
}