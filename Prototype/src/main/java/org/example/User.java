package org.example;

public record User(String name) implements Copyable {
    @Override
    public Object copy() {
        return new User(this.name);
    }
}
