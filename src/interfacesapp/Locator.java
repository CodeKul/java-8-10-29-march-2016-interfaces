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
public class Locator {

    void locate(GpsLocation location) {

        if (location instanceof Animal) {
            
            Animal animal = (Animal) location;
            animal.eat();
            animal.getLocation();
            
        } else if (location instanceof Car) {
            Car car = (Car) location;
            car.applyBreaks();
            car.getLocation();
        }
    }
}          
