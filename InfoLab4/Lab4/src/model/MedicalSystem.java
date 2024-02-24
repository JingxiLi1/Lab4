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
public class MedicalSystem {
    DoctorDirectory doctorDirs;
    PatientDirectory patientDirs;
    PeopleDirectory peopleDirs;
    HospitalDirectory hospitalDirs;
    ArrayList<Community> communities;
    ArrayList<String> cities;
    
    private static volatile MedicalSystem instance = null;
    
    private MedicalSystem(){
        doctorDirs = DoctorDirectory.getInstance();
        patientDirs = PatientDirectory.getInstance();
        peopleDirs = PeopleDirectory.getInstance();
        hospitalDirs = HospitalDirectory.getInstance();
        communities = new ArrayList<Community>();
    }
    
    public static MedicalSystem getInstance(){
        if(instance == null){
            synchronized(MedicalSystem.class){
                if(instance == null){
                    instance = new MedicalSystem();
                }
            }
        }
        return instance;
    }
    
    public ArrayList<Community> getCommunities(){
        return this.communities;
    }
    
    public void addCommunity(Community comm){
        for(Community c : communities){
            if(c.getCity() == comm.getCity() && c.getName() == comm.getName()) return;
        }
        this.communities.add(comm);
    }
    
    
    public ArrayList<String> getCities(){
        return this.cities;
    }
    
    public void addCity(String city){
        for(String c : cities){
            if(c == city) return;
        }
        this.cities.add(city);
    }
    
}
