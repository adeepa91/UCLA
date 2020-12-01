package com.student.info.services;

import com.student.info.model.Grade;

import java.util.List;

public interface GradeService {

    void saveOrUpdateGrade(Grade grade);

    List<Grade> getGradesForStudentNumber(long studentNumber);

    List<Grade> getGradesForSubject(String subject);

}
