package com.company.Day13;


import java.time.LocalDate;

public class InheritanceDemos {

  public static void main(String[] args){

    Employee emp1 = new Employee(3435);
    emp1.setNamePrefix("Dr.");emp1.setFirstname("Ceasar"); emp1.setLastname("Diez"); emp1.setMi("Z");
    emp1.setBirthDate(LocalDate.of(1986,3,1));
    emp1.setEmpDate(LocalDate.of(2016,7,6));

      Employee emp2 = new Employee(7890);
      emp2.setNamePrefix("Atty.");emp2.setFirstname("Kobe"); emp2.setLastname("Cruz"); emp2.setMi("X");
      emp2.setBirthDate(LocalDate.of(1970,2,9));
      emp2.setEmpDate(LocalDate.of(2016,7,6));

      Employee emp3 = new Employee(7894);
      emp3.setNamePrefix("RN");emp3.setFirstname("Shaq"); emp3.setLastname("O'Neal"); emp3.setMi("O");
      emp3.setBirthDate(LocalDate.of(1990,3,20));
      emp3.setEmpDate(LocalDate.of(1995,11,20));

    Consultant co1 = new Consultant(8989);
    co1.setNamePrefix("Eng.");co1.setFirstname("Terry"); co1.setLastname("Bondok"); co1.setMi("A");
    co1.setBirthDate(LocalDate.of(1986,3,1));
    co1.setContStart(LocalDate.of(2013,5,1));
    co1.setContEnd(LocalDate.of(2018,10,15));

    PersonRepository companyRepository = new PersonRepository();
    companyRepository.addPerson(emp1);
    companyRepository.addPerson(emp2);
    companyRepository.addPerson(emp3);
    companyRepository.addPerson(co1);

    System.out.println("\nList of persons from the repository:");
    for (Person x: companyRepository.getPersons()){
      System.out.println(x);
    }
  }
}
