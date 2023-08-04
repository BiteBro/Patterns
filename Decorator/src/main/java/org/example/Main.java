package org.example;

public class Main {
    public static void main(String[] args) {

        Inform p = new Product();
        p = new IceCream(p);

        System.out.println(p.cost());
        System.out.println(p.description());

        System.out.println();

        p = new VanilaIceCream(p);

        System.out.println(p.cost());
        System.out.println(p.description());

        Inform b = new Product();
        b = new Bread(b);

        System.out.println(b.cost());
        System.out.println(b.description());

        System.out.println();

        b = new SoyaBread(b);

        System.out.println(b.cost());
        System.out.println(b.description());
    }
}