package com.company.Day14;

import java.time.LocalDate;

public class HRApplication {
  public static void main(String[] args){
    PersonRepository repository = new PersonRepository();

    Person a = new Person(3433);
    a.setFirstname("Joan"); a.setLastname("Zola"); a.setMi("B");
    a.setBirthDate(LocalDate.of(1990,1,1));
    Address ad1 = new Address();
    ad1.setHseUnitNo("67F"); ad1.setStreetCity("Tramo St."); ad1.setProvince("Rizal");
    a.setAddress(ad1);
    repository.addPerson(a);

    Person b = new Person(3413);
    b.setFirstname("Simon"); b.setLastname("Garfunkel"); b.setMi("Z");
    b.setBirthDate(LocalDate.of(1991,2,1));
    Address ad2 = new Address();
    ad2.setHseUnitNo("343"); ad2.setStreetCity("Malapantao St."); ad2.setProvince("MM");
    b.setAddress(ad2);
    repository.addPerson(b);

    Person c = new Person(1002);
    c.setFirstname("Fyodor"); c.setLastname("Dostoyevsky"); c.setMi("Z");
    c.setBirthDate(LocalDate.of(1989,12,1));
    Address ad3 = new Address();
    ad3.setHseUnitNo("Lot 5 Blk2"); ad3.setStreetCity("Pleasant View Subvd."); ad3.setProvince("Rizal");
    c.setAddress(ad3);
    repository.addPerson(c);

    Person d = new Person(1005);
    d.setFirstname("Mark"); d.setLastname("Anthony"); d.setMi("I");
    d.setBirthDate(LocalDate.of(1980,7,1));
    Address ad4 = new Address();
    ad4.setHseUnitNo("56"); ad4.setStreetCity("Shaw Blvd."); ad4.setProvince("MM");
    d.setAddress(ad4);
    repository.addPerson(d);

    Person e = new Person(9005);
    e.setFirstname("Brene"); e.setLastname("Catalina"); e.setMi("I");
    e.setBirthDate(LocalDate.of(1985,5,14));
    Address ad5 = new Address();
    ad5.setHseUnitNo("No. 11/E"); ad5.setStreetCity("Towers Condo."); ad5.setProvince("Laguna");
    e.setAddress(ad5);
    repository.addPerson(e);

    Person f = new Person(9003);
    f.setFirstname("George"); f.setLastname("Burgos"); f.setMi("I");
    f.setBirthDate(LocalDate.of(1992,3,22));
    Address ad6 = new Address();
    ad6.setHseUnitNo("Unit 4/Bldg 3"); ad6.setStreetCity("Mansions Haven"); ad6.setProvince("Laguna");
    f.setAddress(ad6);
    repository.addPerson(f);

    Person g = new Person(9103);
    g.setFirstname("George"); g.setLastname("Mariano"); g.setMi("I");
    g.setBirthDate(LocalDate.of(1991,6,19));
    Address ad7 = new Address();
    ad7.setHseUnitNo("1A"); ad7.setStreetCity("Burgos Circle"); ad7.setProvince("MM");
    g.setAddress(ad7);
    repository.addPerson(g);

    // Person with the a duplicate ID (same as above), should not be added
    Person h = new Person(9103);
    h.setFirstname("Georgina"); h.setLastname("Mariano"); h.setMi("B");
    h.setBirthDate(LocalDate.of(1992,6,30));
    Address ad8 = new Address();
    ad8.setHseUnitNo("1A"); ad8.setStreetCity("Burgos Circle"); ad8.setProvince("MM");
    h.setAddress(ad8);
    repository.addPerson(h);

    repository.sortRepositoryByLastName();
    repository.sortRepositoryByProvince();

    repository.showRoster();

    // get a person
    long id = 9103;
    Person per = repository.getPersonById(id);
    System.out.println("\n\nfinding person with ID="+id+":\n"+per);

  }
}
