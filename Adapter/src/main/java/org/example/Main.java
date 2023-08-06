package org.example;

public class Main {
    public static void main(String[] args) {
        Repository r = new Adapter();
        r.insert();
        r.delete();

        System.out.println();

        Repository r2 = new AdapterWithoutExtends(new ServiceImpl());
        r2.insert();
        r2.delete();
    }
}
