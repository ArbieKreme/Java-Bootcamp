package com.jwt.model;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subjectId;

    @Column(name = "name")
    private String subjectName;

    @Column(name = "inTime")
    private LocalTime inTime;

    @Column(name = "outTime")
    private LocalTime outTime;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;

    public Subject(){}

    public Subject(String subjectName, LocalTime inTime, LocalTime outTime) {
        this.subjectName = subjectName;
        this.inTime = inTime;
        this.outTime = outTime;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public LocalTime getInTime() {
        return inTime;
    }

    public LocalTime getOutTime() {
        return outTime;
    }

    public Department getDepartment() {
        return department;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setInTime(LocalTime inTime) {
        this.inTime = inTime;
    }

    public void setOutTime(LocalTime outTime) {
        this.outTime = outTime;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Subject ID : " + subjectId + "\n" +
                "Subject Name : " + subjectName + "\n" +
                "Department : " + department + "\n" +
                "Schedule : " + inTime + " - " + outTime;
    }


}
