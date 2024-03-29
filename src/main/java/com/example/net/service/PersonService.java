package com.example.net.service;


import com.example.net.dao.PersonDao;
import com.example.net.entity.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonDao personDao;

    public String findNameByID(int id)
    {
        return personDao.findNameById(id);
    }

    public String findStudentIDByID(int pid)
    {
        return personDao.findStudentIDByID(pid);
    }

    public Person login(String name, String studentid)
    {
        return personDao.login(name,studentid);
    }

}
