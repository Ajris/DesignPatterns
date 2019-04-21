import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.setRadius(5);
        rectangle.setWidth(4);
        rectangle.setHeight(3);

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());

        Circle clonedCircle = (Circle) circle.clone();
        Rectangle clonedRectangle = (Rectangle) rectangle.clone();

        System.out.println(clonedCircle.toString());
        System.out.println(clonedRectangle);
    }
}
