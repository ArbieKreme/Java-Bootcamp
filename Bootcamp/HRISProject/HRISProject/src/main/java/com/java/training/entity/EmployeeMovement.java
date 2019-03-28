package com.java.training.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee_movement")
public class EmployeeMovement {

    @Id
    @Column(name = "emp_movement_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeMovementId;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "pos_id")
    private Position position;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id")
    private Department department;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "site_id")
    private Site site;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "movement_type_id")
    private MovementType movementType;

    @Column(name = "effectivity_date")
    private LocalDate effectivityDate;

    public long getEmployeeMovementId() {
        return employeeMovementId;
    }

    public void setEmployeeMovementId(long employeeMovementId) {
        this.employeeMovementId = employeeMovementId;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public MovementType getMovementType() {
        return movementType;
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }

    public LocalDate getEffectivityDate() {
        return effectivityDate;
    }

    public void setEffectivityDate(LocalDate effectivityDate) {
        this.effectivityDate = effectivityDate;
    }
}
