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
public class TrianguloServices implements AreaInterface{
   double area;
    @Override
    public void put( double base, double alto ) {
  area=base*alto/2;
  
    }
    
     @Override
  public double get(){
     
      return area;
  }
  
}
