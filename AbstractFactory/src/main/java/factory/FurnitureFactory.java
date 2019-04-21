package factory;

import type.Chair;
import type.CoffeeTable;
import type.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeTable();
}
