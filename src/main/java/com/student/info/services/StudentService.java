package com.student.info.services;

import com.student.info.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    void saveOrUpdateStudent(Student student);

    Student getStudentByStudentNumber(Long studentNumber);

    Student getStudentByEmail(String email);

    void deleteStudent(String id);
}
