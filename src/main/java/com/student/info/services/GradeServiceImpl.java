package com.student.info.services;

import com.student.info.model.Grade;
import com.student.info.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService{

    @Autowired
    private GradeRepository gradeRepo;

    @Override
    public void saveOrUpdateGrade(Grade grade) {
        gradeRepo.save(grade);
    }

    @Override
    public List<Grade> getGradesForStudentNumber(long studentNumber) {
        return gradeRepo.findByStudentNumber(studentNumber);
    }
}
