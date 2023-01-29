package com.cx.team.domain;

/**
 * @Author cx
 * @Date 2023/01/29/20:54
 */
public class Printer implements Equipment{

    private String name;
    private String type;

    @Override
    public String getDescription() {
        return null;
    }


    public Printer() {
    }

    public Printer(String name,String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
