package victorian;

import type.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void putCup() {
        System.out.println("Put cup on victorian");
    }
}
