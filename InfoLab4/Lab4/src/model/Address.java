/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yulon
 */
public class Address {
    String city;
    String house;
    Community comm;

    public Address(String city, String house, Community comm) {
        this.city = city;
        this.house = house;
        this.comm = comm;
    }

    public String getCity() {
        return city;
    }

    public String getHouse() {
        return house;
    }

    public Community getComm() {
        return comm;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setComm(Community comm) {
        this.comm = comm;
    }
    
}
