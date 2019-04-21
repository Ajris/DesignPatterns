public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {

    }

    public Rectangle(Rectangle rectangle) {
        super();
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
