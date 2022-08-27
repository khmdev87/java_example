package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.demo.Person;

@Mapper
public interface MainMapper {
    public List<Person> SelectPersons() throws Exception;
    public Person SelectPerson(int id) throws Exception;
    public void InsertPerson(Map paramMap) throws Exception;
    public void DeletePerson(int id) throws Exception;
    public void UpdatePerson(Map paramMap) throws Exception;
}
