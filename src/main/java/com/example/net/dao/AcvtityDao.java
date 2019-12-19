package com.example.net.dao;


import com.example.net.entity.Event;
import com.example.net.entity.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface AcvtityDao {


    List<Info> findInfoByName(@Param("name")String name);

    List<Info> findInfoByType(@Param("type")String type);

    int insertActivity(@Param("eid")int eid,@Param("pid")int pid);

    List<Event> findInfo();

    Integer search(@Param("eid")int eid,@Param("pid")int pid);

}
