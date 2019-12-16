package com.example.net.controller;


import com.example.net.entity.Event;
import com.example.net.service.EventService;
import com.example.net.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Test {

    @Autowired
    PersonService personService;

    @Autowired
    EventService eventService;

    @RequestMapping(value = "/test/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String findNameById(@PathVariable("id")int id)
    {
        return personService.findNameByID(id);
    }

    @RequestMapping(value = "/findStudentIdById/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String findStudentIDByID(@PathVariable("id")int id)
    {
        return personService.findStudentIDByID(id);
    }

    @RequestMapping(value = "/findEventByName/{name}",method = RequestMethod.GET)
    @ResponseBody
    public List<Event> findEventByName(@PathVariable("name")String name)
    {
        return eventService.findEventByName(name);
    }

    @RequestMapping(value = "/findEventByType/{type}",method = RequestMethod.GET)
    @ResponseBody
    public List<Event> findEventByType(@PathVariable("type")String type)
    {
        return eventService.findEventByType(type);
    }


}
