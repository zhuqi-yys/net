package com.example.net.controller;


import com.example.net.entity.Event;
import com.example.net.entity.Person;
import com.example.net.service.EventService;
import com.example.net.util.RequestAndResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/event")
public class EventController {

    @Autowired
    EventService eventService;

    //这个是根据具体的事件名称进行查找，比如说我找   足球1  的相关信息,一般不用这个，用activity
    @RequestMapping(value = "/findEventByName/{name}",method = RequestMethod.GET)
    @ResponseBody
    public List<Event> findEventByName(@PathVariable("name")String name)
    {
        return eventService.findEventByName(name);
    }

    //根据类型找活动  ,比如说我找  足球   的相关信息  ，一般不用这个，用activity
    @RequestMapping(value = "/findEventByType/{type}",method = RequestMethod.GET)
    @ResponseBody
    public List<Event> findEventByType(@PathVariable("type")String type)
    {
        return eventService.findEventByType(type);
    }

    @RequestMapping("/insertEvent")
    @ResponseBody
    public int insertEvent(HttpServletRequest request, HttpServletResponse response) {
        RequestAndResponse.formmat(request,response);
        String name = request.getParameter("name");
        String location = request.getParameter("location");
       // Date startTime = request.getParameter("start_time");
        String date = request.getParameter("start_time");
        java.sql.Date startTime = java.sql.Date.valueOf(date);
        java.sql.Date endTime = startTime;
        String type = request.getParameter("type");
       int size = Integer.parseInt(request.getParameter("size"));
        String remark = request.getParameter("remark");
        String organizer = request.getParameter("organizer");
        return eventService.insertEvent(name, location,
                startTime, endTime,type,
        size, remark, organizer);

    }



}
