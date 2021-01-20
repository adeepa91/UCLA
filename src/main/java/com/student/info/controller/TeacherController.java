package com.student.info.controller;

import com.student.info.model.Teacher;
import com.student.info.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/save")
    public void saveOrUpdateTeacher(@RequestBody Teacher teacher){
        teacherService.saveOrUpdateTeacher(teacher);
    }

}
