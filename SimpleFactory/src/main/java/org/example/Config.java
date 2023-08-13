package org.example;

public interface Config {
    void readConfig();
    static Config getConfig(String name){
        if (name.equalsIgnoreCase("XML")){
            return new XMLconfig();
        }else if (name.equalsIgnoreCase("YAML")){
            return new YAMLconfig();
        }else{
            throw new RuntimeException();
        }
    }
}
