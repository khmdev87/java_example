package com.example.demo.model.demo;

import java.util.List;

import com.example.demo.model.common.BaseDto;

public class Persons extends BaseDto {
    List<Person> persons;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
    
}
