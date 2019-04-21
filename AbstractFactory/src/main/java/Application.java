import factory.FurnitureFactory;
import type.Chair;
import type.CoffeeTable;
import type.Sofa;

public class Application {
    private Sofa sofa;
    private Chair chair;
    private CoffeeTable coffeeTable;
    private FurnitureFactory factory;

    public Application(FurnitureFactory factory) {
        this.factory = factory;
    }

    public void createChair(){
        chair = factory.createChair();
    }

    public void createSofa(){
        sofa = factory.createSofa();
    }

    public void createCoffeeTable(){
        coffeeTable = factory.createCoffeTable();
    }

    public void sitOn(){
        chair.sitOn() ;
    }

    public void putCup(){
        coffeeTable.putCup();
    }

    public void layDown(){
        sofa.layDown();
    }
}
