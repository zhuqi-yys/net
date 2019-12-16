package com.example.net.dao;


import com.example.net.entity.Event;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EventDao {

    public List<Event> findEventByName(@Param("name") String name);

    public List<Event> findEventByType(@Param("type") String type);

}
