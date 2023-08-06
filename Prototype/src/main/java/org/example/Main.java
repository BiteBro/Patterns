package org.example;

public class Main {
    public static void main(String[] args) {

        Copyable c = new User("Patric");
        System.out.println( ((User) c).name());
        System.out.println(c);


        User u = (User) c.copy();
        System.out.println(u);
        System.out.println(u.name());
    }
}