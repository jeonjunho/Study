package builderPattern.Item;

import builderPattern.interfaces.Item;
import builderPattern.interfaces.Packing;
import builderPattern.packing.Bottle;
import builderPattern.packing.Wrapper;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
