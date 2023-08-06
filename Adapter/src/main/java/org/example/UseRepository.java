package org.example;

public class UseRepository implements Repository{
    @Override
    public void insert() {
        System.out.println("UseRepository insert");
    }

    @Override
    public void delete() {
        System.out.println("UseRepository delete");
    }
}
