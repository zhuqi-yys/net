package com.example.net.service;

import com.example.net.dao.AcvtityDao;
import com.example.net.entity.Info;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Service
public class ActivityService {


    @Autowired
    AcvtityDao acvtityDao;

    public List<Info> findInfoByName(String name){
        return acvtityDao.findInfoByName(name);
    }

    public List<Info> findInfoByType(String type){
        return acvtityDao.findInfoByType(type);
    }


    public int insertActivity(int eid,int pid)
    {
        return  acvtityDao.insertActivity(eid,pid);
    }




}
