package com.cx.exer;

/**
 * @author cx
 * @date 2023/01/22/20:55
 */
public class Girl {
    private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void marry(Boy boy){
        System.out.println("我想要嫁给" + boy.getName());
        boy.marry(this);
    }

    public int compare(Girl girl){
        if(this.age > girl.age){
            return 1;
        }else if(this.age < girl.age){
            return -1;
        }else{
            return 0;
        }

    }
}
