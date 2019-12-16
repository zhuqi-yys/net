package com.example.net.dao;


import com.example.net.entity.Event;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface EventDao {

    public List<Event> findEventByName(@Param("name") String name);

    public List<Event> findEventByType(@Param("type") String type);

    public int insertEvent(@Param("name")String name, @Param("location")String location,
                           @Param("startTime") Date startTime, @Param("endTime")Date endTime, @Param("type")String type,
                           @Param("size")int size, @Param("remark")String remark, @Param("organizer")String organizer);

}
