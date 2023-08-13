package org.example;

public class YAMLconfig implements ConfigFactoryMethod{
    @Override
    public void readConfiguration() {
        System.out.println("Read yaml config");
    }
}
