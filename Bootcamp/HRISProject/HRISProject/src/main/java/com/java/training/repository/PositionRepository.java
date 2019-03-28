package com.java.training.repository;

import com.java.training.entity.Position;
import com.java.training.entity.Site;
import com.java.training.util.HibernateConnectionUtil;
import org.hibernate.Session;

public class PositionRepository {
    public Position getPosition(long positionId){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            return session.get(Position.class,positionId);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
