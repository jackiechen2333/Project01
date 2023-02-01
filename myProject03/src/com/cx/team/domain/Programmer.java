package com.cx.team.domain;

import com.cx.team.service.Status;

/**
 * @Author cx
 * @Date 2023/01/29/21:05
 */
public class Programmer extends Employee{
    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
    }

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.status = status;
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    protected String getMemberDetails() {
        return getMemberId() + "/" + getDetails();
    }

    public String getDetailsForTeam(){
        return getMemberDetails() + "\t程序员";
    }
}
