package com.jwt.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;

    @Column(name = "name")
    private String departmentName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department", orphanRemoval = true)
    private List<Subject> subjectList;

    public Department(){}

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    //Getter
    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    //Setter

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Department ID : " + departmentId + "\n" +
                "Department Name : " + departmentName;
    }
}
