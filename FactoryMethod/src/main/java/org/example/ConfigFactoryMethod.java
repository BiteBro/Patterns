package org.example;

public interface ConfigFactoryMethod {
    void readConfiguration();

    static ConfigFactoryMethod getConfig(String s){
        if (s.equalsIgnoreCase("XML")){
            return new XMLconfig();
        }
        if (s.equalsIgnoreCase("yaml")){
            return new YAMLconfig();
        } else{
            throw new RuntimeException();
        }
    }
}
