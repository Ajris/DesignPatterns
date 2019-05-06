package square;

public class SquareBucket {
    private double width;

    public SquareBucket(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare(){
        return Math.pow(this.width, 2);
    }
}
