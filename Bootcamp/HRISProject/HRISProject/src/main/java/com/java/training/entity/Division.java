package com.java.training.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "division")
public class Division {

    @Id
    @Column(name = "div_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long divisionId;

    @Column(name = "div_code")
    private String divisionCode;

    @Column(name = "div_name")
    private String divisionName;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Department> departmentList;

    public long getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(long divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }
}
