package modern;

import type.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void putCup() {
        System.out.println("Put cup on modern");
    }
}
