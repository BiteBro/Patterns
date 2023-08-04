package org.example.subscribers;

import org.example.publisher.Boss;

public class One implements CallMes{
    private Boss boss;
    private String mess = "Old mess";

    public One() {
    }

    public One(Boss boss) {
        this.boss = boss;
    }

    @Override
    public void message(String s) {

        this.mess = boss.getMessage() + "Hi";
    }
    public void printMess(){
        System.out.println(mess);
    }
}
