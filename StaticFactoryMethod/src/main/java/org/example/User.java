package org.example;

public class User {
    private final String name;
    private final int age;
    private final int driveLicenseNumber;
    private final boolean driveLicense;

    private User(String name, int age, int driveLicenseNumber, boolean driveLicense) {
        this.name = name;
        this.age = age;
        this.driveLicenseNumber = driveLicenseNumber;
        this.driveLicense = driveLicense;
    }

    public static User createUserWithDriveLicense(String name, int age, int driveLicenseNumber){
        return new User(name, age, driveLicenseNumber, true);
    }

    public static User createUserWithoutDriveLicense(String name, int age){
        return new User(name, age, -1, false);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", driveLicenseNumber=" + driveLicenseNumber +
                ", driveLicense=" + driveLicense +
                '}';
    }
}
