package com.example.springboot.service.impl;

import com.example.springboot.mapper.StudentMapper;
import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public Student queryStudentById(Integer id) {
        Student s  = studentMapper.selectByPrimaryKey(id);
        return s;
    }
}