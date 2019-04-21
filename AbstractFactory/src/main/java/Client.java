import factory.ModernFactory;
import factory.VictorianFactory;

public class Client {
    public static void main(String[] args) {
        Application modernApp = new Application(new ModernFactory());
        Application victorianApp = new Application(new VictorianFactory());
        doEverything(modernApp);
        doEverything(victorianApp);
    }

    private static void doEverything(Application app) {
        app.createChair();
        app.createSofa();
        app.createCoffeeTable();
        app.layDown();
        app.putCup();
        app.sitOn();
    }
}
