package com.example.net.controller;


import com.example.net.service.PersonService;
import com.example.net.util.RequestAndResponse;
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


    @RequestMapping("/login")
    @ResponseBody
    public String demo(HttpServletRequest request, HttpServletResponse response) {
        RequestAndResponse.formmat(request,response);
        String name = request.getParameter("name");
        String studentid = request.getParameter("studentid");
       return personService.login(name,studentid);
    }

}
