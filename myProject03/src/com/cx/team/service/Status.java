package com.cx.team.service;

/**
 * @Author cx
 * @Date 2023/01/29/21:06
 */
public class Status {

    private final String NAME;

    public Status(String NAME) {
        this.NAME = NAME;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return  NAME;
    }
}
