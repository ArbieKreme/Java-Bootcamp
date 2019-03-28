package com.company.Day13;

import java.time.LocalDate;

public class Person {
  private long personId;
  private String lastname, firstname, mi;
  private LocalDate birthDate;
  private Address address;
  private Address zipCode;
  private String namePrefix;

  // Constructors:
  public Person(long personId) {
    this.personId = personId;
  }

  // class methods
  public int computeAgeInYears() {
    LocalDate now = LocalDate.now();
    int years = now.getYear() - birthDate.getYear();
    return years;
  }

  public String toString() {
    return "ID=" + personId + ": "+ namePrefix + " " +firstname + " "  + mi + " " +lastname;
  }
  // getters and setters

  public long getPersonId() {
    return personId;
  }

  public void setPersonId(long personId) {
    this.personId = personId;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getMi() {
    return mi;
  }

  public void setMi(String mi) {
    this.mi = mi;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String getNamePrefix(){ return namePrefix;}

  public void setNamePrefix(String namePrefix){ this.namePrefix = namePrefix;}

}