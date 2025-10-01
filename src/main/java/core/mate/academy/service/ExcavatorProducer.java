package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        ArrayList<Excavator> excavators = new ArrayList<Excavator>();
        excavators.add(new Excavator());
        return excavators;
    }
}
