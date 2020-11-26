package com.student.info.controller;

import com.student.info.model.Teacher;
import com.student.info.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping(value = "/all")
    public List<Teacher> getAllTeachers(){
        return teacherService.findAll();
    }

}
