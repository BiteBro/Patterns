package org.example;

public class SoyaBread implements Inform{
    private Inform inf;

    public SoyaBread(Inform inf) {
        this.inf = inf;
    }

    @Override
    public String description() {
        return inf.description() + " Soya";
    }

    @Override
    public int cost() {
        return inf.cost() + 3;
    }
}
