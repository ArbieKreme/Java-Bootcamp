package com.company.Day11;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PersonRepository {
  private ArrayList<Person> persons;

  public PersonRepository(){
    persons = new ArrayList<>();
  }

  // TODO this method should check that person.personId is unique
  public void addPerson(Person person){
    for(Person p : persons){
      if(p.getPersonId()==person.getPersonId()){
        return;
      }
    }
    persons.add(person);
  }

  public Person getPersonId(long personId){
    for(Person p : persons){
      if(p.getPersonId()==personId){
        return p;
      }
    }
    return null;
  }

  public void showRoster(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.println("Person Roster");
    System.out.println("Id\tName\tBirthdate/Age\tAddress");

    String temp = "";
    for(Person p : persons){

      String province = p.getAddress().getProvince();
      if(province.compareToIgnoreCase(temp)!=0){
        temp = province;
        System.out.println("\nProvince: "+temp.toUpperCase());
      }

      System.out.printf("%-4d %-24s %-8s (%dyrs) %-20s\n",p.getPersonId(),
              p.getLastname().trim()+", "+p.getFirstname().trim()+" "+p.getMi()+".",
              p.getBirthDate().format(formatter),p.computeAgeInYears(),
              p.getAddress().getHouseNum()+", "+
              p.getAddress().getCity()
      );
    }
  }

  public void sortByLastName(){
    for(int i = 0; i<persons.size()-1;i++){
      for(int j = 0; j>0; j--){
        if(persons.get(j).getLastname().
                compareToIgnoreCase(persons.get(j-1).getLastname())<0){
          Person temp = persons.set(j-1,persons.get(j));
          persons.set(j,temp);
        }
      }
    }
  }

  public void sortByProvince(){
    for(int i = 0; i<persons.size()-1;i++){
      for(int j = i+1; j>0; j--){
        if(persons.get(j).getAddress().getProvince().compareToIgnoreCase(persons.get(j-1).getAddress().getProvince())<0){
          Person temp = persons.set(j-1, persons.get(j));
          persons.set(j,temp);
        }
      }
    }
  }
}
