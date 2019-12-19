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
        String data = request.getParameter("start_time");
        String type = request.getParameter("type");
      //  int size = request.getParameter("size");
        String remark = request.getParameter("remark");
        String organizer = request.getParameter("organizer");
//        return eventService.insertEvent(name, location,
//                startTime, endTime,type,
//        size, remark, organizer);

        return 1;
    }
    //发起一个活动，  这里面的数据都要从前端进行获取
//    @RequestMapping(value = "/insertEvent")
////    @ResponseBody
////    public int insertEvent(){
////        //获取当前日期
////        Date day=new Date();
////        //调整成指定的格式
////        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
////        //开始时间
////        Date startTime=null;
////        try {
////            startTime = sdf.parse(sdf.format(day));
////        } catch (ParseException e) {
////            // TODO 自动生成 catch 块
////            e.printStackTrace();
////        }
////        Calendar ca=Calendar.getInstance();
////        ca.setTime(startTime);
////        //这里我自己加了三个小时，根据具体的情况进行修改
////        ca.add(Calendar.HOUR_OF_DAY, 3);
////        //结束时间
////        Date endTime = ca.getTime();
////
////
////        //这里的数据是我自己写的，需要通过前端获得
////        return eventService.insertEvent("篮球3","3号篮球场",endTime,ca.getTime(),"篮球",10,"","原子武士");
////
////    }


}
