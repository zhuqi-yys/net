package com.example.net.controller;


import com.example.net.dao.AcvtityDao;
import com.example.net.entity.Info;
import com.example.net.service.ActivityService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    ActivityService activityService;
    //根据姓名进行查询 ，比如查    琦玉  参加了什么活动
    @RequestMapping(value = "/findInfoByName/{name}")
    @ResponseBody
    public List<Info> findInfoByName(@PathVariable("name")String name){
        return activityService.findInfoByName(name);
    }
    //根据类型进行查询       比如查足球
    @RequestMapping(value = "/findInfoByType/{type}")
    @ResponseBody
    public List<Info> findInfoByType(@PathVariable("type")String type){
        return activityService.findInfoByType(type);
    }

    //插入     aid 和eid 要根据前端传过来的进行输入
    @RequestMapping(value = "/insertActivity/{pid}/{eid}")
    @ResponseBody
    public int  insertActivity(@PathVariable("pid")int pid,@PathVariable("eid")int eid){
        return activityService.insertActivity(pid,eid);
    }




}