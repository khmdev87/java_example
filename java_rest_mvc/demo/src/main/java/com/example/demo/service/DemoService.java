package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MainMapper;
import com.example.demo.model.demo.Person;

@Service
public class DemoService {

    @Autowired
    private MainMapper mainMapper;

    public Person configurePerson() {
        Person person = new Person();
        person.setId("870919");
        person.setName("Kim heemin");
        person.setAge("36");
        person.setMajor("Computer Sience");
        return person;
    }

    public List<Person> SelectPersons() throws Exception {
        List<Person> dto = mainMapper.SelectPersons();
        return dto;
    }

    public Person SelectPerson(int id) throws Exception {
        Person dto = mainMapper.SelectPerson(id);
        return dto;
    }

    public void InsertPerson(Map paramMap) throws Exception{
        mainMapper.InsertPerson(paramMap);
    }

    public void DeletePerson(int id) throws Exception {
        mainMapper.DeletePerson(id);
    }

    public void UpdatePerson(Map paramMap) throws Exception {
        mainMapper.UpdatePerson(paramMap);
    }
}
