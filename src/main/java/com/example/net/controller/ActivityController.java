package com.example.net.controller;


import com.example.net.dao.AcvtityDao;
import com.example.net.entity.Activity;
import com.example.net.entity.Event;
import com.example.net.entity.Info;
import com.example.net.entity.InfoWithSize;
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
    public InfoWithSize findInfoByName(@PathVariable("name")String name){
        return new InfoWithSize(activityService.findInfoByName(name),activityService.findInfoByName(name).size());
    }
    //根据类型进行查询       比如查足球
    @RequestMapping(value = "/findInfoByType/{type}")
    @ResponseBody
    public List<Info> findInfoByType(@PathVariable("type")String type){
        return activityService.findInfoByType(type);
    }

    //根据姓名进行activity 进行查询
    @RequestMapping(value = "/findInfoByEid/{eid}")
    @ResponseBody
    public List<Info> findInfoByAid(@PathVariable("eid")int eid){
        return activityService.findInfoByAid(eid);
    }



    //插入     aid 和eid 要根据前端传过来的进行输入
    @RequestMapping(value = "/insertActivity/{pid}/{eid}")
    @ResponseBody
    public int  insertActivity(@PathVariable("pid")int pid,@PathVariable("eid")int eid){
        Integer flag = activityService.search(eid,pid);
        if(flag==null)
        {
           return activityService.insertActivity(eid,pid);
        }else
        {
            return -1;
        }

    }

    @RequestMapping(value = "/findInfo")
    @ResponseBody
    public List<Event>  findInfo(){
        return activityService.findInfo();
    }

    //插入     aid 和eid 要根据前端传过来的进行输入
    @RequestMapping(value = "/insertEvaluation/{pid}/{eid}/{evaluation}")
    @ResponseBody
    public int  insertEvaluation(@PathVariable("pid")int pid,@PathVariable("eid")int eid,@PathVariable("evaluation")String evaluation){

        return activityService.updateEvaluation(pid,eid,evaluation);

    }


}
