package org.example;

public class Main {
    public static void main(String[] args) {
        Config config = Config.getConfig("yaml");
        config.readConfig();
        System.out.println("\n");
        Config config2 = Config.getConfig("xml");
        config2.readConfig();
    }
}