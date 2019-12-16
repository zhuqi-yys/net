package com.example.net.entity;


import java.util.Date;
import java.util.Objects;

public class Event {


    int eid;
    String name;
    String location;
    Date startTime;
    Date endTime;
    String type;
    int size;
    String organizer;
    String remark;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getOrginizer() {
        return organizer;
    }

    public void setOrginizer(String orginizer) {
        this.organizer = organizer;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return eid == event.eid &&
                size == event.size &&
                Objects.equals(name, event.name) &&
                Objects.equals(location, event.location) &&
                Objects.equals(startTime, event.startTime) &&
                Objects.equals(endTime, event.endTime) &&
                Objects.equals(type, event.type) &&
                Objects.equals(organizer, event.organizer) &&
                Objects.equals(remark, event.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, name, location, startTime, endTime, type, size, organizer, remark);
    }
}
