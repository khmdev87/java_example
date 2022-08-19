package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.demo.Person;

public interface Mapper {
    public List<Person> SelectPersons() throws Exception;
}
