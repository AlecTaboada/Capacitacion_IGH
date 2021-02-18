/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.pruebas;

import solid.dto.CalculoDto;
import solid.services.CuadradoServices;

/**
 *
 * @author PC
 */
public class Prueba02 {
    public static void main(String[] args) {
        double lado;
        double base;
     CalculoDto dto = new CalculoDto();
     dto.setLado(6);
     dto.setBase(8);
     lado=dto.getLado();
     base=dto.getBase();
     
     CuadradoServices cal = new CuadradoServices();
     cal.put(lado, base);
     double areas = cal.get();
        System.out.println("area es :"+areas);
    }
}
