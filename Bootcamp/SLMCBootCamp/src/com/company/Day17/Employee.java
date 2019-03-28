package com.company.Day17;

import java.util.List;

public class Employee extends People{
    private String employeeNo;
    private String companyName;
    private String position;
    private Address address;
    private List<ContactNumber> contactNumbers;


    public String getEmployeeNo() {
        return employeeNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPosition() {
        return position;
    }

    public Address getAddress() {
        return address;
    }

    public List<ContactNumber> getContactNumbers() {
        return contactNumbers;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContactNumbers(List<ContactNumber> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }
}
