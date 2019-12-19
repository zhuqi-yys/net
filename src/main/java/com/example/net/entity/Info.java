package com.example.net.entity;


import java.sql.Date;

public class Info {

    int aid;
    int eid;
    int pid;

    //person 相关信息
    String studnetId;//应该是person Id,但是数据库这样写了，就不改了
    String personName;
    //事件相关信息
    String eventName;
    String location;
    Date startTime;
    Date endTime;
    String type;
    int size;
    //备注
    String remark;
    String organizer;

    //活动相关信息
    String evaluation;

    public Info(int aid, int eid, int pid, String studnetId, String personName, String eventName, String location, Date startTime, Date endTime, String type, int size, String remark, String organizer, String evaluation) {
        this.aid = aid;
        this.eid = eid;
        this.pid = pid;
        this.studnetId = studnetId;
        this.personName = personName;
        this.eventName = eventName;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
        this.size = size;
        this.remark = remark;
        this.organizer = organizer;
        this.evaluation = evaluation;
    }

//    public Info(String studnetId, String personName, String eventName, String location, Date startTime, Date endTime, String type, int size, String remark, String organizer, String evaluation) {
////        this.studnetId = studnetId;
////        this.personName = personName;
////        this.eventName = eventName;
////        this.location = location;
////        this.startTime = startTime;
////        this.endTime = endTime;
////        this.type = type;
////        this.size = size;
////        this.remark = remark;
////        this.organizer = organizer;
////        this.evaluation = evaluation;
////    }

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

    public String getStudnetId() {
        return studnetId;
    }

    public void setStudnetId(String studnetId) {
        this.studnetId = studnetId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }


}
