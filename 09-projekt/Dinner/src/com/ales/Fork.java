package com.ales;

import java.util.concurrent.locks.ReentrantLock;

public class Fork extends ReentrantLock {

    private String name;
    private boolean isLocked = false;

    public Fork(String name) {
        super(true);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
