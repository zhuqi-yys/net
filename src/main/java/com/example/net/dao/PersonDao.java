package com.example.net.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonDao {

    String findNameById(@Param("pid") int pid);

    String findStudentIDByID(@Param("pid")int pid);




}
