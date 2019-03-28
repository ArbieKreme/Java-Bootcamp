package com.company.Day16.KennyTutorials;

public class Address {
    private String roomNo;
    private String streetNo;
    private String barangay;
    private String municipality;
    private int zipCode;

    @Override
    public String toString() {
        return  "Room Number : " + roomNo +
                " " + streetNo + " Street" +
                " Barangay : " + barangay +
                ", Municipality of " + municipality +
                " " + zipCode;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public String getBarangay() {
        return barangay;
    }

    public String getMunicipality() {
        return municipality;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
