package com.example.demo.service;

import javax.print.attribute.standard.PresentationDirection;

import org.springframework.stereotype.Service;

import com.example.demo.model.demo.Person;

@Service
public class DemoService {

    public Person configurePerson() {
        Person person = new Person();
        person.setId("870919");
        person.setName("Kim heemin");
        person.setAge("36");
        person.setMajor("Computer Sience");
        return person;
    }
}
