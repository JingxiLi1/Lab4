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
public class IDList {
    ArrayList<Integer> IDs;
    
    private static volatile IDList instance = null;
    
    private IDList(){
        IDs = new ArrayList<>();
    }
    
    public static IDList getInstance(){
        if(instance == null){
            synchronized(IDList.class){
                if(instance == null){
                    instance = new IDList();
                }
            }
        }
        return instance;
    }
    
    public ArrayList<Integer> getIDs(){
        return this.IDs;
    }
    
    public void addID(int id){
        this.IDs.add(id);
    }
    
}
