package org.example;

public class Main {
    public static void main(String[] args) {
        ParamBuilder builder = new ParamBuilder.Builder("1").build();

        System.out.println(builder);

        ParamBuilder builder2 = new ParamBuilder.Builder("1")
                .withParam2("2")
                .withParam3("3")
                .build();

        System.out.println(builder2);
    }
}