package factory;

import modern.ModernChair;
import modern.ModernCoffeeTable;
import modern.ModernSofa;
import type.Chair;
import type.CoffeeTable;
import type.Sofa;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeTable() {
        return new ModernCoffeeTable();
    }
}
