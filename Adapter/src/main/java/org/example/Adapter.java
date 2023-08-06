package org.example;

public class Adapter extends ServiceImpl implements Repository{
    @Override
    public void insert() {
        add();
    }

    @Override
    public void delete() {
        remove();
    }
}
