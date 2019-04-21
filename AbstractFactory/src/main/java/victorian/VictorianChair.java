package victorian;

import type.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sat on victorian");
    }
}
