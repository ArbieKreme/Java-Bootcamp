package com.java.training.entity;

import javax.persistence.*;

@Entity
@Table(name = "site")
public class Site {

    @Id
    @Column(name = "site_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long siteId;

    @Column(name = "site_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String siteCode;

    @Column(name = "site_desc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String siteDescription;

    public long getSiteId() {
        return siteId;
    }

    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public String getSiteDescription() {
        return siteDescription;
    }

    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
    }
}
