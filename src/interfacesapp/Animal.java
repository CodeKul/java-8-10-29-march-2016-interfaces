/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesapp;

/**
 *
 * @author aniruddha
 */
public class Animal implements GpsLocation{
    
    void eat(){
        System.out.println("Animal is eating");
    }
    
    void run() {
        System.out.println("Animal is running");
    }

    @Override
    public void getLocation() {
        System.out.println("In Jungle");
    }
}
