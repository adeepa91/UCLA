package com.student.info.controller;

import com.student.info.model.Student;
import com.student.info.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/all")
    public List<Student> getAllStudents(){
        return studentService.findAll();
    }

    @PostMapping(value = "/save")
    public ResponseEntity<String> saveOrUpdateStudent(@RequestBody Student student){
        studentService.saveOrUpdateStudent(student);
        return new ResponseEntity<>("Successfully Save!!", HttpStatus.OK);
    }

    @GetMapping(value = "/studentNumber/{studentNumber}")
    public Student getStudentByStudentNumber(@PathVariable("studentNumber") Long studentNumber){
        return studentService.getStudentByStudentNumber(studentNumber);
    }
}
