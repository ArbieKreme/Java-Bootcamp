package com.java.training.repository;

import com.java.training.entity.MovementType;
import com.java.training.entity.Site;
import com.java.training.util.HibernateConnectionUtil;
import org.hibernate.Session;

public class MovementTypeRepository {
    public MovementType getMovementType(long movementTypeId){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            return session.get(MovementType.class,movementTypeId);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
