package com.student.info.controller;

import com.student.info.model.Grade;
import com.student.info.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grades")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @PostMapping(value = "/save")
    public ResponseEntity<String> saveOrUpdateGrade(@RequestBody Grade grade){
        gradeService.saveOrUpdateGrade(grade);
        return new ResponseEntity<>("Successfully Added", HttpStatus.OK);
    }

    @GetMapping(value = "/student/{studentNumber}")
    public List<Grade> getGradesForStudent(@PathVariable("studentNumber") long studentNumber){
        return gradeService.getGradesForStudentNumber(studentNumber);
    }
}
