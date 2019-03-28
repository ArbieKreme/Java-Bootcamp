package entity;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;

    @Column(name = "province")
    private String province;

    @Column(name = "street")
    private String street;

    @Column (name = "zipCode")
    private String zipCode;

    public Address(){}

    public Address(String city, String country, String province, String street, String zipCode) {
        this.city = city;
        this.country = country;
        this.province = province;
        this.street = street;
        this.zipCode = zipCode;
    }

    //Getters

    public long getAddressId() {
        return addressId;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    //Setters

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address : " + street + " St." + city + " City" + province + " " + country + " " + zipCode;
    }
}
