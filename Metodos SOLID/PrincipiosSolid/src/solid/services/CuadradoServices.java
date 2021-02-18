/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.services;

/**
 *
 * @author PC
 */
public class CuadradoServices implements SelectorInterface{
   double area;
    @Override
    public void put( double lado,double alto) {
  area=lado*lado;
  
    }
    
     @Override
  public double get(){
     
      return area;
  }
  
}
