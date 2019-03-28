package com.java.training.repository;

import com.java.training.entity.Department;
import com.java.training.util.HibernateConnectionUtil;
import org.hibernate.Session;

public class DepartmentRepository {

    public long addDepartment(Department department){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 0;
    }

    public Department getDepartment(long departmentId){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            return session.get(Department.class,departmentId);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public boolean updateDepartment(Department department){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.update(department);
            session.getTransaction().commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    public boolean deleteDepartment(long departmentId){

        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.delete(session.get(Department.class,departmentId));
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
