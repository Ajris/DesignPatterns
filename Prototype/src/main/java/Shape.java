public abstract class Shape {
    private Integer x;
    private Integer y;
    private String color;

    public Shape() {
    }

    public Shape(Shape shape){
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Shape clone();

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
