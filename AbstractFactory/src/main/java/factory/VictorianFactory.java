package factory;

import type.Chair;
import type.CoffeeTable;
import type.Sofa;
import victorian.VictorianChair;
import victorian.VictorianCoffeeTable;
import victorian.VictorianSofa;

public class VictorianFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeTable() {
        return new VictorianCoffeeTable();
    }
}
