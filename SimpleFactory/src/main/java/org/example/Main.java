package org.example;

public class Main {
    public static void main(String[] args) {
        Config config = new FactoryConfig().getConfig("yaml");
        config.readConfig();
        System.out.println("\n");
        Config config2 = new FactoryConfig().getConfig("xml");
        config2.readConfig();
    }
}