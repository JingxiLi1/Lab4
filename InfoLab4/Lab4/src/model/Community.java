/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yulon
 */
public class Community {
    String city;
    String name;
    ArrayList<String> houses;
    ArrayList<Hospital> hospitals;

    public Community() {
        this.houses = new ArrayList<String>();
        this.hospitals = new ArrayList<Hospital>();
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getHouses() {
        return houses;
    }

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHouses(ArrayList<String> houses) {
        this.houses = houses;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    
    public void addHouse(String house) {
        this.houses.add(house);
    }

    public void addHospital(Hospital hospital) {
        this.hospitals.add(hospital);
    }

    @Override
    public String toString() {
        return name;
    }
}
