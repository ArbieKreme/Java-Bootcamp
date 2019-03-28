package com.java.training.repository;

import com.java.training.entity.Site;
import com.java.training.util.HibernateConnectionUtil;
import org.hibernate.Session;

public class SiteRepository {

    public long addSite(Site site){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            session.save(site);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 0;
    }

    public Site getSite(long siteId){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            return session.get(Site.class,siteId);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public boolean updateSite(Site site){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.update(site);
            session.getTransaction().commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    public boolean deleteSite(long siteId){

        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.delete(session.get(Site.class,siteId));
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
