package com.company.Day13;

import java.time.LocalDate;

public class Employee extends Person {

  private LocalDate empDate;


  public Employee(int id){
    super(id);
  }

  public LocalDate getEmpDate() {
    return empDate;
  }

  public String toString(){
    return super.toString()+" Employee starting: "+empDate;

  }

  public void setEmpDate(LocalDate empDate) {
    this.empDate = empDate;
  }
}
