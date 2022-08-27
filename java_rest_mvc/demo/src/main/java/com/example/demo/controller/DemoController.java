package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.common.BaseDto;
import com.example.demo.model.common.ResponseDto;
import com.example.demo.model.demo.Person;
import com.example.demo.model.demo.Persons;
import com.example.demo.service.DemoService;
import com.example.demo.util.DemoUtil;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;
    @Autowired
    DemoUtil demoUtil;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello, World!!";
    }

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String pString() {
        return "ping pong";
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public ResponseDto getconfigurePerson() {
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

    @RequestMapping(value = "/persons/{id}", method = RequestMethod.GET)
    public ResponseDto getPerson(@PathVariable int id) throws Exception {
        ResponseDto rsp = new ResponseDto();
        rsp.setRsp(demoService.SelectPerson(id));
        return rsp;
    }

    @RequestMapping(value = "/persons", method = RequestMethod.POST)
    public ResponseDto makePerson(@RequestBody Person person) throws Exception {
        ResponseDto rsp = new ResponseDto();
        demoService.InsertPerson(demoUtil.convertParam(person));
        BaseDto obj = new BaseDto();
        obj.setStat("ok");
        rsp.setRsp(obj);
        return rsp;
    }

    @RequestMapping(value = "/persons/{id}", method = RequestMethod.DELETE)
    public ResponseDto DeletePerson(@PathVariable int id) throws Exception {
        ResponseDto rsp = new ResponseDto();
        demoService.DeletePerson(id);
        BaseDto obj = new BaseDto();
        obj.setStat("ok");
        rsp.setRsp(obj);
        return rsp;
    }

    @RequestMapping(value = "/persons/{id}", method = RequestMethod.PUT)
    public ResponseDto updatePerson(@PathVariable int id, @RequestBody Person person) throws Exception {
        ResponseDto rsp = new ResponseDto();
        person.setId(String.valueOf(id));
        demoService.UpdatePerson(demoUtil.convertParam(person));
        BaseDto obj = new BaseDto();
        obj.setStat("ok");
        rsp.setRsp(obj);
        return rsp;
    }
}
