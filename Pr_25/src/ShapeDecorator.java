public class ShapeDecorator implements Shape {
    protected final Shape shape;

    protected ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    @Override
    public void draw() {
        if (shape != null){
            shape.draw();
        }
    }
}
