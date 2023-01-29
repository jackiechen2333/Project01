package com.cx.team.service;

import com.cx.team.domain.*;

import static  com.cx.team.service.Data.*;

/**
 * @Author cx
 * @Date 2023/01/29/22:09
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment = null;
            double bonus;
            int stock;

            switch (type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }

    }

    private Equipment createEquipment(int index){
        int type = Integer.parseInt(EQIPMENTS[index][0]);
        switch (type){
            case PC:
                return new PC(EQIPMENTS[index][1],EQIPMENTS[index][2]);
            case NOTEBOOK:
                return new NoteBook(EQIPMENTS[index][1],Double.parseDouble(EQIPMENTS[index][2]));
            case PRINTER:
                return new Printer(EQIPMENTS[index][1],EQIPMENTS[index][2]);
        }
        return null;
    }

    public Employee[] getAllEmployees(){
        return null;
    }

    public Employee getEmployee(int id){
        return null;
    }
}
