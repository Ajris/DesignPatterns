public class Circle extends Shape{
    private int radius;

    public Circle(){

    }

    public Circle(Circle circle){
        super();
        this.radius = circle.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
