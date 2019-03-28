package com.java.training.repository;

import com.java.training.entity.Division;
import com.java.training.util.HibernateConnectionUtil;
import com.sun.org.apache.xpath.internal.operations.Div;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.NoResultException;

public class DivisionRepository {

    public long addDivision(Division division){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            session.save(division);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 0;
    }

    public Division getDivision(long divisionId){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            return session.get(Division.class,divisionId);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public boolean updateDivision(Division division){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.update(division);
            session.getTransaction().commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    public boolean deleteDivision(long divisionId){

        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
                session.delete(session.get(Division.class,divisionId));
                session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

}