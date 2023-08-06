package org.example;

public class Main {
    public static void main(String[] args) {
        User user = User.createUserWithDriveLicense("Bob", 55, 555333222);
        System.out.println(user);
        User user1 = User.createUserWithoutDriveLicense("Gog", 15);
        System.out.println(user1);
    }
}