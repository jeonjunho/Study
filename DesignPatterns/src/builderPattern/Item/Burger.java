package builderPattern.Item;

import builderPattern.interfaces.Item;
import builderPattern.interfaces.Packing;
import builderPattern.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
