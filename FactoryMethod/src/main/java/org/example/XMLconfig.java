package org.example;

public class XMLconfig implements ConfigFactoryMethod{
    @Override
    public void readConfiguration() {
        System.out.println("Read xml config");
    }
}
