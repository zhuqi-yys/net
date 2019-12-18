package com.example.net.entity;


import java.util.Objects;

public class Person {


    int pid;
    String studentid;
    String name;

    public int getId() {
        return pid;
    }

    public void setId(int id) {
        this.pid = pid;
    }

    public String getStudentID() {
        return studentid;
    }

    public void setStudentID(String studentid) {
        studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return pid == person.pid &&
                Objects.equals(studentid, person.studentid) &&
                Objects.equals(name, person.name);
    }



    @Override
    public int hashCode() {
        return Objects.hash(pid, studentid, name);
    }
}
