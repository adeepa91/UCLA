package com.student.info.services;

import com.student.info.model.Grade;
import com.student.info.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService{

    @Autowired
    private GradeRepository gradeRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveOrUpdateGrade(Grade grade) {
        gradeRepo.save(grade);
    }

    @Override
    public List<Grade> getGradesForStudentNumber(long studentNumber) {
        return gradeRepo.findByStudentNumber(studentNumber);
    }

    @Override
    public List<Grade> getGradesForSubject(String subject) {
        return gradeRepo.findBySubject(subject);
    }

    @Override
    public List<Grade> getGradesForSubjectAndYear(String subject, int year) {
        //Custom query using mongotemplate
        Query query = new Query();
        query.addCriteria(Criteria.where("subject").is(subject));
        query.addCriteria(Criteria.where("year").is(year));
        return mongoTemplate.find(query,Grade.class);
    }
}
