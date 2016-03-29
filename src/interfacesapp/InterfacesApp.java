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
public class InterfacesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal animal = new Animal();
        animal.getLocation();
        
        Car car = new Car();
        car.getLocation();
        
        Locator locator = new  Locator();
        locator.locate(car);
        
        locator.locate(animal);
        
        GpsLocation location = new Animal();
        locator.locate(location);
                
    }
}
