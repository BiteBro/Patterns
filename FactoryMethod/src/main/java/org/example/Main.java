package org.example;

public class Main {
    public static void main(String[] args) {
        ConfigFactoryMethod cfm = ConfigFactoryMethod.getConfig("xml");
        cfm.readConfiguration();
    }
}