package repository;

import entity.Department;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateConnectionUtil;

import java.util.List;

public class DepartmentRepository {

    public Department getDepartmentById(int departmentId){
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

    public List<Department> getAllDepartments(){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            String sql = "from " + Department.class.getName();
            Query<Department> query1 = session.createQuery(sql);
            return query1.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public void addDepartment(Department department){
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
    }

    public void updateDepartment(Department department){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            session.update(department);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            }finally {
            session.close();
        }
        }

    public void deleteDepartment(int departmentId) {
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();
            session.delete(session.get(Department.class, departmentId));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }session.close();
    }
}
