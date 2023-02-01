package com.cx.team.service;

import com.cx.team.domain.Architect;
import com.cx.team.domain.Designer;
import com.cx.team.domain.Employee;
import com.cx.team.domain.Programmer;

/**
 * @Author cx
 * @Date 2023/01/30/10:36
 */
public class TeamService {
    private static int counter = 1;//给memberId赋值使用
    private final int MAX_MEMBER = 5;//限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队成员
    private int total = 0;//记录开发团队中实际的人数

    public TeamService(){
        super();
    }

    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];

        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }


    public void addMember(Employee e) throws TeamException{
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }

        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发成员，无法添加");
        }

        Programmer p = (Programmer)e;
        if(isExist(p)){
            throw new TeamException("该成员已在开发团队中");
        }

        if(p.getStatus().getNAME().equals("BUSY")){
            throw new TeamException("该员工已是某团队成员");
        }else if(p.getStatus().getNAME().equals("VOCATION")){
            throw new TeamException("该员正在休假，无法添加");
        }

        int numOfArch = 0,numOfDes = 0,numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if(team[i] instanceof Architect){
                numOfArch++;
            }else if(team[i] instanceof Designer){
                numOfDes++;
            }else if(team[i] instanceof Programmer){
                numOfPro++;
            }

        if (p instanceof Architect){
            if(numOfArch >= 1){
                throw new TeamException("团队中至多有一名架构师");
            }
        }else if(p instanceof Designer){
            if(numOfDes >= 2){
                throw new TeamException("团队中至多有一名设计师");
            }
        }else if(p instanceof Programmer){
            if(numOfPro >= 3){
                throw new TeamException("团队中至多有一名程序员");
            }
        }
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
        team[total++] = p;
        }

    }

    private boolean isExist(Programmer p){
        for (int i = 0; i < total; i++) {
            if(team[i].getId() == p.getId()){
                return true;
            }
        }
        return false;
    }

    public void removeMember (int memberid) throws TeamException{
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberid) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if(i == total){
            throw new TeamException("未找到指定memberId的员工，删除失败");
        }

        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }

        team[--total] = null;

    }

}
