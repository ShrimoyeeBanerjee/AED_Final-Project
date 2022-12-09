/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employe;

/**
 *
 * @author hrushithaputtala
 */
public class Employe {
    private String name;
    private int id;
    private static int count = 1;
   

    public Employe() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
}
