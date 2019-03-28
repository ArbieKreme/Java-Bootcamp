package com.java.training.repository;

import com.java.training.entity.*;
import com.java.training.util.HibernateConnectionUtil;
import com.sun.org.apache.xpath.internal.operations.Div;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {


    public long addEmployee(Employee employee){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();

            employee.setStatus("Active");

            session.save(employee);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 0;
    }

    public boolean initiateEmployeeMovement(long employeeId, EmployeeMovement employeeMovement){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.update(getEmployee(employeeId));
            session.getTransaction().commit();

            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    public List<Employee>showEmployeeRoster(LocalDate asOfDate){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        List<Employee> employeeList = new ArrayList<>();
        try{
            session.beginTransaction();
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
            Root<Employee> root = cq.from(Employee.class);
            Join<Employee, EmployeeMovement> studentSubjectJoin = root.join("employeeMovementList");
            cq.where( cb.equal(studentSubjectJoin.get("effectivityDate"),asOfDate));
            cq.orderBy(cb.desc(studentSubjectJoin.get("effectivityDate")));
            employeeList = session.createQuery(cq).getResultList();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }

        return employeeList;
    }

    public void printEmployeeRoster(List<Employee> employeeList){
        DateTimeFormatter dfmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        EmployeeMovementRepository er = new EmployeeMovementRepository();
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            Division newDivisionOccurence;
            Department newDepartmentOccurence;

            for (Employee employee : employeeList){
                List<EmployeeMovement>employeeMovements = employee.getEmployeeMovementList();

                for(EmployeeMovement employeeMovement : employeeMovements){

                    newDepartmentOccurence = employeeMovement.getDepartment();
                    newDivisionOccurence = employeeMovement.getDepartment().getDivision();

                    if(employeeMovement.getDepartment().getDivision().equals(session.get(Division.class,newDivisionOccurence.getDivisionId()))){

                        newDivisionOccurence = employeeMovement.getDepartment().getDivision();

                        System.out.println("Division " + session.get(Division.class,employeeMovement.getDepartment().getDivision().getDivisionId()).getDivisionId() + " : " + session.get(Division.class,1).getDivisionName() + "\n");
                        System.out.printf("%-15s\t%-15s\t%-20s\t%15s\t%15s\n","Employee No.","Fullname","Hired Date","Position","Immediate Supervisor");

                            if(employeeMovement.getDepartment().equals(session.get(Department.class,newDepartmentOccurence.getDepartmentId()))){
                                System.out.printf("%-15s\t%-15s\t%-20s\t%15s\t%15s\n",employee.getEmployeeId(),employee.getFirstName()+" "+employee.getMiddleName()+" "+employee.getLastName(),employeeMovement.getEffectivityDate(),employeeMovement.getPosition(),employee.getImmediateSuperior());
                            }

                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public Employee getEmployee(long employeeId){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            return session.get(Employee.class,employeeId);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public boolean updateEmployee(Employee employee){
        Session session = HibernateConnectionUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.update(employee);
            session.getTransaction().commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    public boolean deleteEmployee(long employeeId){

        Session session = HibernateConnectionUtil.getSessionFactory().openSession();

        try{
            session.delete(session.get(Employee.class,employeeId));
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
