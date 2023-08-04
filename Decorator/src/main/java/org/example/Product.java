package org.example;

public class Product implements Inform{
    private int cost;
    private String descr;

    @Override
    public String description() {
        return "Product";
    }

    @Override
    public int cost() {
        return 1;
    }
}
