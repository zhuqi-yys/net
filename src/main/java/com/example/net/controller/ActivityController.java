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

import java.util.List;

@Controller
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    ActivityService activityService;

    @RequestMapping(value = "/findInfoByName/{name}")
    @ResponseBody
    public List<Info> findInfoByName(@PathVariable("name")String name){
        return activityService.findInfoByName(name);
    }

    @RequestMapping(value = "/findInfoByType/{type}")
    @ResponseBody
    public List<Info> findInfoByType(@PathVariable("type")String type){
        return activityService.findInfoByType(type);
    }


}
