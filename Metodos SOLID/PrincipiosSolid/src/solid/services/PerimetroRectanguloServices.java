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
public class PerimetroRectanguloServices implements AreaInterface{
   double perimetro;
    @Override
    public void put( double lado,double alto) {
  perimetro=lado*2+alto*2;
  
    }
    
     @Override
  public double get(){
     
      return perimetro;
  }
  
}
    