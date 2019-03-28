package com.jwt.dao;

import com.jwt.model.Student;
import com.jwt.model.Subject;

import java.util.List;

public interface StudentDAO {

    public void addStudent(Student student);

    public List<Student> getAllStudents();

    public List<Subject> getSubjects(long studentId);

    public void deleteStudent(long studentId);

    public Student updateStudent(Student student);

    public Student getStudent(long studentId);
}
