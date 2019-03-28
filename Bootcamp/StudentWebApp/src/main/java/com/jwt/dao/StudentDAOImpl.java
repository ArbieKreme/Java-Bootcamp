package com.jwt.dao;

import com.jwt.model.Student;
import com.jwt.model.Subject;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addStudent(Student student) {
        sessionFactory.getCurrentSession().saveOrUpdate(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }

    @Override
    public List<Subject> getSubjects(long studentId) {

        Student student = sessionFactory.getCurrentSession().get(Student.class,studentId);
        List<Subject> subjects =  student.getSubjects();

        return subjects;
    }

    @Override
    public Student updateStudent(Student student) {
        sessionFactory.getCurrentSession().update(student);
        return student;
    }

    @Override
    public void deleteStudent(long studentId) {
        Student student = (Student) sessionFactory.getCurrentSession().load(
                Student.class, studentId);
        if (null != student) {
            this.sessionFactory.getCurrentSession().delete(student);
        }
    }

    @Override
    public Student getStudent(long studentId) {
        return (Student) sessionFactory.getCurrentSession().get(
                Student.class, studentId);
    }
}
