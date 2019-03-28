package com.java.training.repository;

import com.java.training.entity.EmployeeMovement;
import com.java.training.util.HibernateConnectionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMovementRepository {

    public List<EmployeeMovement> getAllEmployeeMovement(){
        List<EmployeeMovement> employeeMovementList = new ArrayList<>();

        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        String sql = "from" + EmployeeMovement.class.getName();
        Query<EmployeeMovement> query = session.createQuery(sql);
        try{
            return query.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.clear();
        }

        return  employeeMovementList;
    }
}
