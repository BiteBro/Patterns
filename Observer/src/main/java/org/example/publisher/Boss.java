package org.example.publisher;

import org.example.subscribers.CallMes;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    private List<CallMes> subscrs = new ArrayList();
    private String message = "New message";

    public void addSubscr(CallMes subscr){
        subscrs.add(subscr);
    }
    public void removeSubscr(CallMes subscr){
        subscrs.remove(subscr);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void callUpdate(){
        for (CallMes c: subscrs){
            c.message(this.getMessage());
        }
    }
}
