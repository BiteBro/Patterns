package org.example;

public class FactoryConfig {
    public Config getConfig(String name){
        if (name.equalsIgnoreCase("XML")){
            return new XMLconfig();
        }else if (name.equalsIgnoreCase("YAML")){
            return new YAMLconfig();
        }else{
            throw new RuntimeException();
        }
    }
}
