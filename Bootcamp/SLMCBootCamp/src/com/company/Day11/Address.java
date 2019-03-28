package com.company.Day11;

public class Address {
    private String houseNum;
    private String city;
    private String province;

    public Address(String houseNum, String city, String province){
        this.houseNum = houseNum;
        this.city = city;
        this.province = province;
    }

    public String toString(){ return houseNum+", "+city+", "+province+".";}

    public String getHouseNum(){return houseNum;}

    public void setHouseNum(String houseNum){this.houseNum = houseNum;}

    public String getCity(){return city;}

    public void setCity(String city){this.city = city;}

    public String getProvince(){return province;}

    public void setProvince(String province){this.province = province;}
}
