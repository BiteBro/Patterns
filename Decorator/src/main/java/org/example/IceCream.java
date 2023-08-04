package org.example;

public class IceCream implements Inform{
    private Inform inform;

    public IceCream(Inform inform) {
        this.inform = inform;
    }

    @Override
    public String description() {
        return inform.description() + " IceCream";
    }

    @Override
    public int cost() {
        return inform.cost() + 2;
    }
}
