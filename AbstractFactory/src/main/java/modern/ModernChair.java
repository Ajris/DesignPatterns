package modern;

import type.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sat on modern");
    }
}
