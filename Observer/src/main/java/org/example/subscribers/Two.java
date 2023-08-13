package org.example.subscribers;

public class Two implements CallMessage {
    private String mess = "Old mess";
    @Override
    public void message(String s) {
        this.mess = s;
    }
    public void printMess(){
        System.out.println(mess);
    }
}
