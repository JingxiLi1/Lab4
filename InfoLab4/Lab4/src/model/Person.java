/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;
import java.util.UUID;

/**
 *
 * @author yulon
 */
public class Person {
    String name;
    long phoneNumber;
    int ID;
    Address address;
    Random rand = new Random();

    public Person() {
        int tmp = rand.nextInt(900000)+100000;
        while(IDList.getInstance().getIDs().contains(tmp)){
            tmp = rand.nextInt(900000)+100000;
        }
        IDList.getInstance().addID(tmp);
        this.ID = tmp;
    }

    
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
