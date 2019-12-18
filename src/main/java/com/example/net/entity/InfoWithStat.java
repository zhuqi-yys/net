package com.example.net.entity;

import java.util.Date;

public class InfoWithStat {

    Info information;
    boolean state;

    public InfoWithStat(Info information){
        this.information = information;
        judgeState();
    }

    public void judgeState(){
        Date end = information.getEndTime();
        Date now = new Date();
        if(now.after(end))
            state = true; //未结束
        else
            state = false;//结束
    }

    public boolean getState(){
        return state;
    }
}


