package com.student.info.repository;

import com.student.info.model.Grade;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GradeRepository extends MongoRepository<Grade,String> {

    List<Grade> findByStudentNumber(long studentNumber);
}
