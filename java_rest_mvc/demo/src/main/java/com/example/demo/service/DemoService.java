package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.Mapper;
import com.example.demo.model.demo.Person;

@Service
public class DemoService {

	@Autowired
	private SqlSession sqlSession;

    public Person configurePerson() {
        Person person = new Person();
        person.setId("870919");
        person.setName("Kim heemin");
        person.setAge("36");
        person.setMajor("Computer Sience");
        return person;
    }

	public List<Person> SelectPersons() throws Exception {
		Mapper mappers = sqlSession.getMapper(Mapper.class);
		List<Person> dto = mappers.SelectPersons();
		return dto;
	}
}
