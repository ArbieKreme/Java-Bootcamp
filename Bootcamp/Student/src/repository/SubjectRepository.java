package repository;

import entity.Department;
import entity.Student;
import entity.Subject;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateConnectionUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubjectRepository {

    public Subject getSubjectById(int subjectId){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            return session.get(Subject.class,subjectId);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public List<Subject> getAllSubjects(){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            /*String sql = "from " + Subject.class.getName();
            Query<Subject> query1 = session.createQuery(sql);
            return query1.getResultList();*/
            session.beginTransaction();

            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Subject> cq = cb.createQuery(Subject.class);
            Root<Subject> root = cq.from(Subject.class);
            cq.select(root);
            return session.createQuery(cq).getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public List<Subject> getSubjectsByOutTime12nn(){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        try{
            String getMorningSubjects = "from " + Subject.class.getName() + " where outTime <= '12:00:00'";

            Query getQuery = session.createQuery(getMorningSubjects);

            List<Subject> subjects = getQuery.getResultList();

            return subjects;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public List<Subject> getSubjectsByIntTime12nn(){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            String getMorningSubjects = "from " + Subject.class.getName() + " where outTime >= '12:00:00'";
            Query getQuery = session.createQuery(getMorningSubjects);
            List<Subject> subjects = getQuery.getResultList();
            return subjects;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public void addSubject(Subject subject){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            List<Subject> subjectList = new ArrayList<>();
            Department department = new Department();
            session.beginTransaction();
            subjectList.add(subject);
            department.setSubjectList(subjectList);
            session.save(subject);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public void updateSubject(Subject subject){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            session.update(subject);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public void deleteSubject(int subjectId) {
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();
            session.delete(session.get(Subject.class, subjectId));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            session.close();
        }
        }
    }



