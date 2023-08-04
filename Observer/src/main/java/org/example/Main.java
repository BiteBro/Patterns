package org.example;

import org.example.publisher.Boss;
import org.example.subscribers.One;
import org.example.subscribers.Three;
import org.example.subscribers.Two;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();

        One one = new One(boss);
        Two two = new Two();
        Three three = new Three();

        one.printMess();
        two.printMess();
        three.printMess();

        boss.addSubscr(one);
        boss.addSubscr(two);

        boss.callUpdate();
        System.out.println();
        one.printMess();
        two.printMess();
        three.printMess();
    }
}