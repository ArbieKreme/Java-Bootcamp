package repository;

import entity.Address;
import entity.Student;
import entity.Subject;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateConnectionUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository{
    public Student getStudentById(long studentId){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            return session.get(Student.class,studentId);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public List<Student> getAllStudents(){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        String sql = "from " + Student.class.getName();
        Query<Student> query1 = session.createQuery(sql);
        try{
            return query1.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public List<Student> getStudentsBySubject(Subject subject){

        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{

            /*List<Student> students = session.createQuery(
                    "select distinct student " +
                            "from Student student " +
                            "join  student.subjects sub " +
                            "where sub.subjectId = :subjectId order by sub.subjectId", Student.class )
                    .setParameter( "subjectId", subject.getSubjectId() )
                    .getResultList();
            return students;*/
            session.beginTransaction();
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Student> cq = cb.createQuery(Student.class);
            Root<Student> root = cq.from(Student.class);
            Join<Student, Subject> studentSubjectJoin = root.join("subjects");
            cq.where( cb.equal(studentSubjectJoin.get("subjectId"),subject.getSubjectId()));
            cq.orderBy(cb.desc(studentSubjectJoin.get("subjectId")));
            return session.createQuery(cq).getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
    public List<Student> getStudentByCity(String city){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        try{
            List<Student> students = session.createQuery(
                    "select distinct student " +
                            "from Student student " +
                            "join student.address ad " +
                            "where ad.city = :city order by ad.city", Student.class)
                    .setParameter("city", city)
                    .getResultList();
            return students;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public List<Subject> getSubjectByStudent(Student student){

            Session session = HibernateConnectionUtil.getSessionFactory().openSession();

            try{
                session.beginTransaction();
                Student student1 = session.get(Student.class,student.getStudentId());
                List<Subject> subjects = student1.getSubjects();
                return subjects;
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                session.close();
            }
        return null;
    }

    public void dropSubject(long studentId, List<Subject> subjects){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        StudentRepository sr = new StudentRepository();

        try {

            session.beginTransaction();

            Student existingStudent = session.get(Student.class,studentId);

            if(existingStudent.getSubjects()!= null) {

                System.out.println("\n" + sr.getStudentById(studentId).getFirstName()+" dropped the ff: \n");
                for(Subject subjectToDrop : subjects) {
                    for (Subject enrolledSubject: existingStudent.getSubjects()) {
                        if(enrolledSubject.getSubjectId() == enrolledSubject.getSubjectId()) {

                            existingStudent.getSubjects().remove(subjectToDrop);
                            System.out.println("Dropped" + subjectToDrop.getSubjectName());
                            session.update(existingStudent);

                        }else{
                            System.out.println("test");
                        }
                    }

                }
            }else{
                System.out.println("No subjects to drop");
            }
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public long addStudent(Student student) {

        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            return student.getStudentId();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
            return 0;
        }

    public void enrollStudent(Student student, Subject subject){

        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            student.getSubjects().add(subject);
            session.saveOrUpdate(student);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
    }


    public void updateStudent(Student student){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            session.update(student);
            session.beginTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public void deleteStudent(long studentId) {
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();
            session.delete(session.get(Student.class, studentId));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    }

