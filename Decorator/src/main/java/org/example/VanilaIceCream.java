package org.example;

public class VanilaIceCream implements Inform {
    private Inform inform;

    public VanilaIceCream(Inform inform) {
        this.inform = inform;
    }

    @Override
    public String description() {
        return inform.description() + " Vanilla";
    }

    @Override
    public int cost() {
        return inform.cost() + 2;
    }
}
