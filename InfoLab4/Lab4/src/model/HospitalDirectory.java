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
public class HospitalDirectory {
    ArrayList<Hospital> hospitals;
    DoctorDirectory doctorDirectory;
    
    private static volatile HospitalDirectory instance = null;
    
    private HospitalDirectory(){
        hospitals = new ArrayList<>();
        doctorDirectory = DoctorDirectory.getInstance();
    }
    
    public static HospitalDirectory getInstance(){
        if(instance == null){
            synchronized(HospitalDirectory.class){
                if(instance == null){
                    instance = new HospitalDirectory();
                }
            }
        }
        return instance;
    }
    
    public ArrayList<Hospital> getHospitalsByCity(String city){
        ArrayList<Hospital> hos = new ArrayList<>();
        for(Hospital h : hospitals){
            if(h.getCity() == city) this.hospitals.add(h);
        }
        return hos;
    }
    
    public ArrayList<Hospital> getHospitalsByCommunity(Community community){
        ArrayList<Hospital> hos = new ArrayList<>();
        for(Hospital h : hospitals){
            if(h.getComm() == community) this.hospitals.add(h);
        }
        return hos;
    }
    
    public ArrayList<Hospital> getHospitals(){
        return this.hospitals;
    }
    
    public void addHospital(Hospital hos){
        this.hospitals.add(hos);
    }
    
    public void removeHospital(Hospital hos){
        this.hospitals.remove(hos);
    }
}
