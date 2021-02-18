/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.pruebas;

import solid.dto.CalculoDto;
import solid.services.PerimetroCuadradoServices;

/**
 *
 * @author PC
 */
public class Prueba04 {
    public static void main(String[] args) {
        double lado;
        double base;
     CalculoDto dto = new CalculoDto();
     dto.setLado(6);
     dto.setBase(8);
     lado=dto.getLado();
     base=dto.getBase();
     
     PerimetroCuadradoServices cal = new PerimetroCuadradoServices();
     cal.put(lado, base);
     double  perimetros = cal.get();
        System.out.println("perimetro es :"+ perimetros);
    }
}
