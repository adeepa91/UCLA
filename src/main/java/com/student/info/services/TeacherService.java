package com.student.info.services;

import com.student.info.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAll();

    void saveOrUpdateTeacher(Teacher teacher);
}
