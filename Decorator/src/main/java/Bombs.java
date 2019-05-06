public class Bombs extends TreeDecorator {
    public Bombs(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBombs();
    }

    private String decorateWithBombs() {
        return " with Bombs";
    }
}
