package com.example.net.controller;


import com.example.net.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/person")
@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/findNameById/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String findNameById(@PathVariable("id")int id)
    {
        return personService.findNameByID(id);
    }

    @RequestMapping(value = "/findStudentIdById/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String findStudentIDByID(@PathVariable("id")int id)
    {
        return personService.findStudentIDByID(id);
    }

//    @PostMapping(value = "/logins")
//    public String login(@RequestBody Student student)  {
//        String name = student.getName();
//        String studentid = student.getStudentid();
//        return personService.login(name,studentid);
//    }

    @RequestMapping("/login")
    @ResponseBody
    public String demo(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("textml;charset=utf-8");
        /* 设置响应头允许ajax跨域访问 */
        response.setHeader("Access-Control-Allow-Origin", "*");
        /* 星号表示所有的异域请求都可以接受， */
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
        String name = request.getParameter("name");
        String studentid = request.getParameter("studentid");
       return personService.login(name,studentid);
    }

}
