package com.java.training.entity;

import javax.persistence.*;

@Entity
@Table(name = "movement_type")

public class MovementType {

    @Id
    @Column(name = "mov_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movementTypeId;

    @Column(name = "movement_type_code")
    private String movementTypeCode;

    public long getMovementTypeId() {
        return movementTypeId;
    }

    public void setMovementTypeId(long movementTypeId) {
        this.movementTypeId = movementTypeId;
    }

    public String getMovementTypeCode() {
        return movementTypeCode;
    }

    public void setMovementTypeCode(String movementTypeCode) {
        this.movementTypeCode = movementTypeCode;
    }
}
