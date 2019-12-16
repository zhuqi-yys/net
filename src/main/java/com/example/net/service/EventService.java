package com.example.net.service;


import com.example.net.dao.EventDao;
import com.example.net.entity.Event;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventDao eventDao;
    public List<Event> findEventByName(String name)
    {
        return eventDao.findEventByName(name);
    };


    public List<Event> findEventByType(String type)
    {
        return eventDao.findEventByType(type);
    }


}
