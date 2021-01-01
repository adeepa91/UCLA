package com.student.info.services;

import com.student.info.model.Student;
import com.student.info.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepo;

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public void saveOrUpdateStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public Student getStudentByStudentNumber(Long studentNumber) {
        return studentRepo.findByStudentNumber(studentNumber);
    }

    @Override
    public Student getStudentByEmail(String email) {
        return studentRepo.findByEmail(email);
    }

    @Override
    public void deleteStudent(String id) {
        studentRepo.deleteById(id);
    }
}
