package com.example.net.entity;

import java.util.Objects;

public class Activity {


    int aid;
    int eid;
    int pid;
    String evaluation;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity)) return false;
        Activity activity = (Activity) o;
        return aid == activity.aid &&
                eid == activity.eid &&
                pid == activity.pid &&
                evaluation.equals(activity.evaluation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aid, eid, pid, evaluation);
    }
}
