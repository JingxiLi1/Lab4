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
public class DoctorDirectory {
    ArrayList<Doctor> doctors;
    
    private static volatile DoctorDirectory instance = null;
    
    private DoctorDirectory(){
        doctors = new ArrayList<Doctor>();
    }
    
    public static DoctorDirectory getInstance(){
        if(instance == null){
            synchronized(DoctorDirectory.class){
                if(instance == null){
                    instance = new DoctorDirectory();
                }
            }
        }
        return instance;
    }
    
    public ArrayList<Doctor> getAllDoctors(){
        return this.doctors;
    }
    
    public ArrayList<Doctor> getDoctorsByHospital(Hospital hos){
        ArrayList<Doctor> newhos = new ArrayList<>();
        for(Doctor d: this.doctors){
            if(d.getHospital() == hos) newhos.add(d);
        }
        return newhos;
    }
    
    public void addDoctor(Doctor doc){
        this.doctors.add(doc);
    }
    
    public void removeDoctor(Doctor doc){
        this.doctors.remove(doc);
    }
}
