package com.jwt.service;

import com.jwt.dao.SubjectDAO;
import com.jwt.model.Student;
import com.jwt.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class SubjectServiceImpl implements SubjectService{

    @Autowired
    private SubjectDAO subjectDAO;

    @Override
    @Transactional
    public void addSubject(Subject subject) {
        subjectDAO.addSubject(subject);
    }

    @Override
    @Transactional
    public List<Subject> getAllSubjects() {
        List<Subject>subjectList=subjectDAO.getAllSubjects();
        return subjectList;
    }

    @Override
    public void deleteSubject(long subjectId) {
        subjectDAO.deleteSubject(subjectId);
    }

    @Override
    @Transactional
    public Subject updateSubject(Subject subject) {
        subjectDAO.updateSubject(subject);
        return subject;
    }

    @Override
    @Transactional
    public Subject getSubject(long subjectId) {
        return subjectDAO.getSubject(subjectId);
    }
}
