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
public class Car implements GpsLocation{
    
    void igniteCar(){
        System.out.println("igniting car");
    }
    
    void applyBreaks(){
        System.out.println("Applying breaks");
    }

    @Override
    public void getLocation() {
        
        System.out.println("On street");
    }

    @Override
    public void getVendor() {
        
        System.out.println("Intel");
    }

    @Override
    public void troubleShoot() {
        
        System.out.println("no defect");
    }
}
