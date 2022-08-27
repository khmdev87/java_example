package com.example.demo.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.demo.model.demo.Person;

@Component
public class DemoUtil {
    private Map paramMap;

    public DemoUtil() {
        this.paramMap = new HashMap<String, Object>();
    }

    public Map convertParam(Person person) {
        if (person.getId() != null) {
            paramMap.put("id", Integer.parseInt(person.getId()));
        }
        paramMap.put("name", person.getName());
        paramMap.put("age", Integer.parseInt(person.getAge()));
        paramMap.put("major", person.getMajor());
        return paramMap;
    }
}
