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
public /*abstract*/ interface GpsLocation extends HardwareAware,DefectInformer{
 
    /*public static final */ int GL_CIRCUM = 3;
    
    /* public abstract*/ void getLocation();
    
}
