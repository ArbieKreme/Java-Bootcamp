package com.company.Day13;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

 public class PersonRepository {
  private ArrayList<Person> persons;

  public PersonRepository(){
    persons = new ArrayList<>();
  }

  public void addPerson(Person person){
    // check that the given id is unique otherwise DO NOT add

    for (Person p: persons){
      if (p.getPersonId()==person.getPersonId()){
        // return without adding
        return;
      }
    }
    persons.add(person);
  }

  // get a person by id
  public Person getPersonById(long personId){
    for (Person p: persons){
      if (p.getPersonId()==personId){
        return p;
      }
    }
    return null;
  }

  public ArrayList<Person> getPersons() {
    return persons;
  }

  // sorted by lastName
  public void showRoster(){
    DateTimeFormatter dfmt = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    System.out.println("Persons Roster\n");
    System.out.printf("ID-- Name-------------------- Birthday/Age-------- Address----------------------\n");

    String newProv = "";
    String newZipCode = "";
    int count = 0;
      for (Person p: persons){
          String prov = p.getAddress().getProvince();
          String zipCode = p.getAddress().getZipCode();
          if(zipCode.compareToIgnoreCase(newZipCode)!=0) {
              if (prov.compareToIgnoreCase(newProv) != 0) {
                  if (newZipCode != ""){
                      System.out.println("Total person count: "+count);
                  }
                  // print a new line for province
                  newZipCode = zipCode;
                  newProv = prov;
                  System.out.println("\nProvince: " + newProv + "/Zip: " + newZipCode);
                  count = 0;
              }
          }

          System.out.printf("%-4d %-24s %-8s (%dyrs)  %-20s\n",p.getPersonId(),
                  p.getLastname().trim()+", "+p.getFirstname().trim()+" "+p.getMi()+".",
                  p.getBirthDate().format(dfmt), p.computeAgeInYears(),
                  p.getAddress().getHseUnitNo()+", "+
                          p.getAddress().getStreetCity(),"/"+p.getAddress().getZipCode());
          count ++;
      }
      System.out.println("Total person count: "+count);
      System.out.println("\nGrand Total persons: " +persons.size());
  }
     //System.out.println("Total person count : "+count);


  // Repository Sorter (using bubble sort)
  // sort by last name
  public void sortRepositoryByLastName() {

    for (int i = 0; i < persons.size()-1; i++) {
      for (int j=i+1; j>0; j--) {
        if (persons.get(j).getLastname().
                compareToIgnoreCase(persons.get(j-1).getLastname())<0) {

          Person temp = persons.set(j-1, persons.get(j));
          persons.set(j,temp);
        }
      }
    }
  }

  // sort by province
  public void sortRepositoryByProvince() {

    for (int i = 0; i < persons.size()-1; i++) {
      for (int j=i+1; j>0; j--) {
        if (persons.get(j).getAddress().getProvince().
                compareToIgnoreCase(persons.get(j-1).getAddress().getProvince())<0) {

          Person temp = persons.set(j-1, persons.get(j));
          persons.set(j,temp);
        }
      }
    }
  }

  public void sortRepositoryByZipCode(){
      for (int i = 0; i < persons.size()-1; i++) {
          for (int j=i+1; j>0; j--) {
              if (persons.get(j).getAddress().getZipCode().
                      compareToIgnoreCase(persons.get(j-1).getAddress().getZipCode())<0) {

                  Person temp = persons.set(j-1, persons.get(j));
                  persons.set(j,temp);
              }
          }
      }
  }

 }
