package org.example.publisher;

import org.example.subscribers.CallMessage;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    private final List<CallMessage> subscrs = new ArrayList<>();
    private String message = "New message";

    public void addSubscr(CallMessage subscr){
        subscrs.add(subscr);
    }
    public void removeSubscr(CallMessage subscr){
        subscrs.remove(subscr);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void callUpdate(){
        for (CallMessage c: subscrs){
            c.message(this.getMessage());
        }
    }
}
