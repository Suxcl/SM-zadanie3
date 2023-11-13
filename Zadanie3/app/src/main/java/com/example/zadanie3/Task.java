package com.example.zadanie3;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    public Task(){
        id = UUID.randomUUID();
        date=new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String toString) {
        this.name = toString;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDone(boolean isChecked) {
        this.done=isChecked;
    }

    public boolean isDone() {
        return this.done;
    }

    public UUID getId() {
        return this.id;
    }
}
