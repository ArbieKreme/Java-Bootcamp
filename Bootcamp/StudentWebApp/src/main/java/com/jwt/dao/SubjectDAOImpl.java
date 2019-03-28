package com.jwt.dao;

import com.jwt.model.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubjectDAOImpl implements SubjectDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addSubject(Subject subject) {
        sessionFactory.getCurrentSession().saveOrUpdate(subject);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return sessionFactory.getCurrentSession().createQuery("from Subject").list();
    }

    @Override
    public void deleteSubject(long subjectId) {
        Subject subject = (Subject) sessionFactory.getCurrentSession().load(
                Subject.class, subjectId);
        if (null != subject) {
            this.sessionFactory.getCurrentSession().delete(subject);
        }
    }

    @Override
    public Subject updateSubject(Subject subject) {
        sessionFactory.getCurrentSession().update(subject);
        return subject;
    }

    @Override
    public Subject getSubject(long subjectId) {
        return (Subject) sessionFactory.getCurrentSession().get(
                Subject.class, subjectId);
    }
}
