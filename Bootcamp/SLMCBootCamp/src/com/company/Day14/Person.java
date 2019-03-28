package com.company.Day14;

import java.time.LocalDate;

public class Person {
  private long personId;
  private String lastname, firstname, mi;
  private LocalDate birthDate;
  private Address address;

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
    return "ID=" + personId + ": " + lastname + ", " + firstname + " " + mi + ". [" + address + "]";
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
}