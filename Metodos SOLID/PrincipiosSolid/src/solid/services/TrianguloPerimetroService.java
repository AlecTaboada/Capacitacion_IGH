/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.services;
import java.util.*;
/**
 *
 * @author PC
 */
public class TrianguloPerimetroService implements AreaInterface{
   
   
   double perimetro;
    @Override
    public void put( double lado, double base) {
 
  perimetro=lado+base+lado;
    }
    
     @Override
  public double get(){
     
      return perimetro;
  }
  
}