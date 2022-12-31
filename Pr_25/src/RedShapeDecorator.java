public class RedShapeDecorator extends ShapeDecorator {

    protected RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw(){
        if (shape != null){
            shape.draw();
        }
        System.out.println("Red shape decorator");
    }

    public void setRedBorder(){
        System.out.println("Red border seted");
    }

}
