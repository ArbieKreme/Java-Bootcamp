package com.jwt.dao;

import com.jwt.model.Subject;

import java.util.List;

public interface SubjectDAO {
    public void addSubject(Subject subject);

    public List<Subject> getAllSubjects();

    public void deleteSubject(long subjectId);

    public Subject updateSubject(Subject subject);

    public Subject getSubject(long subjectId);
}
