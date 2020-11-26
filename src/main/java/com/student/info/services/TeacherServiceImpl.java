package com.student.info.services;

import com.student.info.model.Teacher;
import com.student.info.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    private TeacherRepository teacherRepo;

    @Override
    public List<Teacher> findAll() {
        return teacherRepo.findAll();
    }
}
