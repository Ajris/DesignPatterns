public class Main {
    public static void main(String[] args) {
        ChristmasTree tree = new Bombs(new BubbleLights(new Bombs(new BubbleLights(new ChristmasTreeImpl()))));
        System.out.println(tree.decorate());
    }
}
