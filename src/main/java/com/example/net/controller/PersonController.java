package com.example.net.controller;


import com.example.net.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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





}
