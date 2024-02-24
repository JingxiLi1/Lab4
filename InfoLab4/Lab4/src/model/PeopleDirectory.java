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
public class PeopleDirectory {
    ArrayList<Person> people;
    
    private static volatile PeopleDirectory instance = null;
    
    private PeopleDirectory(){
        people = new ArrayList<>();
    }
    
    public static PeopleDirectory getInstance(){
        if(instance == null){
            synchronized(PeopleDirectory.class){
                if(instance == null){
                    instance = new PeopleDirectory();
                }
            }
        }
        return instance;
    }
}
