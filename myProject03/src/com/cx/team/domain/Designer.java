package com.cx.team.domain;

/**
 * @Author cx
 * @Date 2023/01/29/21:50
 */
public class Designer extends Programmer{
    private double bonus;

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t" + getEquipment().getDescription();
    }

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getDetailsForTeam() {
        return getMemberDetails() + "\t设计师\t" + getBonus();
    }
}
