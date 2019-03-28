package com.company.Day14;

public class Address {
  private String hseUnitNo;
  private String streetCity;
  private String province;

  public Address(){}

  public Address(String hseUnitNo, String streetCity, String province) {
    this.hseUnitNo = hseUnitNo;
    this.streetCity = streetCity;
    this.province = province;
  }

  public String toString(){
    return hseUnitNo+", "+streetCity+", "+province+".";
  }

  public String getHseUnitNo() {
    return hseUnitNo;
  }

  public void setHseUnitNo(String hseUnitNo) {
    this.hseUnitNo = hseUnitNo;
  }

  public String getStreetCity() {
    return streetCity;
  }

  public void setStreetCity(String streetCity) {
    this.streetCity = streetCity;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }
}
