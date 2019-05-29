package com.example.helloworld;
import java.util.ArrayList;
import java.util.List;
public abstract class Drinks{
    // assempbly line for the workshops
    protected List<Bartender> bartenders = new ArrayList<Bartender>();
    public Drinks() {
        super();
    }
    public boolean joinWorkshop(Bartender bartender) {
        return bartenders.add(bartender);
    }
    public abstract void manufacture();
    public abstract int minWorkTime();
}
