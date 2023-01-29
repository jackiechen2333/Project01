package com.cx.team.domain;

/**
 * @Author cx
 * @Date 2023/01/29/20:47
 */
public class PC implements Equipment{

    private String model;//机器型号
    private String display;//显示器名称

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
