package org.example;

public class AdapterWithoutExtends implements Repository{
    private Service service;

    public AdapterWithoutExtends(Service service) {
        this.service = service;
    }

    @Override
    public void insert() {
        service.add();
    }

    @Override
    public void delete() {
        service.remove();
    }
}
