package com.java.training.entity;

import javax.persistence.*;

@Entity
@Table(name = "position")
public class Position {

    @Id
    @Column(name = "pos_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long positionId;

    @Column(name = "position_title")
    private String positionTitle;

    @Column(name = "position_code")
    private String positionCode;

    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }
}
