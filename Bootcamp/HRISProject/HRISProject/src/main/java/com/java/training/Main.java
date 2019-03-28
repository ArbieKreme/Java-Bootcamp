package com.java.training;

import com.java.training.entity.*;
import com.java.training.repository.*;
import com.java.training.util.HibernateConnectionUtil;
import javafx.geometry.Pos;
import sun.rmi.server.LoaderHandler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmployeeRepository er = new EmployeeRepository();
        DepartmentRepository dr = new DepartmentRepository();
        DivisionRepository dir = new DivisionRepository();
        SiteRepository sr = new SiteRepository();
        MovementTypeRepository mr = new MovementTypeRepository();
        PositionRepository pr = new PositionRepository();

        Address address1 = new Address();
        address1.setAddressLine("#124 Int. Twin Pioneer St. Don Carlos Village");
        address1.setCity("Pasay");
        address1.setZipCode(1300);

        Address address2 = new Address();
        address2.setAddressLine("Blk. 62 Lot 4 Montreal St. Metrosouth Subdivision");
        address2.setCity("Cavite");
        address2.setZipCode(1407);

        EmployeeMovement movement1 = new EmployeeMovement();
        movement1.setPosition(pr.getPosition(1));
        movement1.setDepartment(dr.getDepartment(1));
        movement1.setMovementType(mr.getMovementType(1));
        movement1.setSite(sr.getSite(1));
        movement1.setEffectivityDate(LocalDate.of(2018,9,24));

        EmployeeMovement movement2 = new EmployeeMovement();
        movement2.setPosition(pr.getPosition(2));
        movement2.setDepartment(dr.getDepartment(2));
        movement2.setSite(sr.getSite(2));

        Employee employee1 = new Employee();
        employee1.setFirstName("Ronald Bo");
        employee1.setMiddleName("Prestado");
        employee1.setLastName("Tecson");
        employee1.setContactNumber("852-2907");
        employee1.setStatus("Active");
        employee1.setBirthDate(LocalDate.of(1995,11,20));
        employee1.setAddress(address1);

        List<EmployeeMovement> employeeMovements1 =new ArrayList<>();
        employeeMovements1.add(movement1);

        employee1.setEmployeeMovementList(employeeMovements1);

        Employee employee2 = new Employee();
        employee2.setFirstName("Christian Albert");
        employee2.setMiddleName("Francisco");
        employee2.setLastName("Soriano");
        employee2.setContactNumber("09279585321");
        employee2.setStatus("Active");
        employee2.setBirthDate(LocalDate.of(1995,5,12));
        employee2.setAddress(address2);
        employee2.setImmediateSuperior(employee1);

        er.addEmployee(employee1);
        er.addEmployee(employee2);

        er.initiateEmployeeMovement(2,movement2);



        HibernateConnectionUtil.shutdown();
    }
}
