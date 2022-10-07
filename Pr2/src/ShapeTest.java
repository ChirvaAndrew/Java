public class ShapeTest {
    public static void main(String[] args){
        Shape test1 = new Shape();
        test1.setName("square");
        test1.setNumberofcorners(4);
        System.out.println(test1.getName());
        System.out.println(test1.getNumberofcorners());
    }
}
