package com.jwt.service;

import com.jwt.dao.StudentDAO;
import com.jwt.model.Student;
import com.jwt.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    public List<Subject> getSubjects(long studentId){return studentDAO.getSubjects(studentId);}

    @Override
    public void deleteStudent(long studentId) {
        studentDAO.deleteStudent(studentId);
    }

    @Override
    @Transactional
    public Student updateStudent(Student student) {
        return studentDAO.updateStudent(student);
    }

    @Override
    public Student getStudent(long studentId) {
        return studentDAO.getStudent(studentId);
    }

    public void setStudentDAO(StudentDAO studentDAO){this.studentDAO = studentDAO;}

    public StudentDAO getStudentDAO(){return studentDAO;}
}
