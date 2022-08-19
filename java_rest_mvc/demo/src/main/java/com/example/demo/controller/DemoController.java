package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.common.ResponseDto;
import com.example.demo.model.demo.Persons;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello, World!!";
    }

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String pString() {
        return "ping pong";
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public ResponseDto getPerson() {
        ResponseDto rsp = new ResponseDto();
        rsp.setRsp(demoService.configurePerson());
        return rsp;
    }

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public ResponseDto getPersons() throws Exception {
        ResponseDto rsp = new ResponseDto();
        Persons persons = new Persons();
        persons.setPersons(demoService.SelectPersons());
        rsp.setRsp(persons);
        return rsp;
    }
}
