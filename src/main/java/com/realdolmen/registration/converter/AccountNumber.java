package com.realdolmen.registration.converter;

import java.io.Serializable;

public class AccountNumber implements Serializable {
    private int prefix, middle, control;

    public AccountNumber() {
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getMiddle() {
        return middle;
    }

    public void setMiddle(int middle) {
        this.middle = middle;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public String toString(){
        return prefix + "-" + middle + "-" + control;
    }
}
