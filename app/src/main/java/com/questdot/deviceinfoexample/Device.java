package com.questdot.deviceinfoexample;

/**
 * Created by HP on 15/12/2016.
 */

public class Device {
    String key;
    String value;

    public Device(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {

        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
