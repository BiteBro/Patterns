package org.example;

public class Bread implements Inform{
    private Inform inform;

    public Bread(Inform inform) {
        this.inform = inform;
    }

    @Override
    public String description() {
        return inform.description() + " Bread";
    }

    @Override
    public int cost() {
        return inform.cost() + 2;
    }
}
