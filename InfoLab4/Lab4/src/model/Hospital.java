/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yulon
 */
public class Hospital {
    String city;
    String name;
    Community comm;

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public Community getComm() {
        return comm;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComm(Community comm) {
        this.comm = comm;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
