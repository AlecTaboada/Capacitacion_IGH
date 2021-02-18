/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.pruebas;

import solid.dto.CalculoDto;
import solid.services.TrianguloPerimetroService;

/**
 *
 * @author PC
 */
public class Prueba06 {
    public static void main(String[] args) {
        double lado;
        double base;
     CalculoDto dto = new CalculoDto();
     dto.setAlto(6);
     dto.setBase(8);
     lado=dto.getAlto();
     base=dto.getBase();
     
     TrianguloPerimetroService cal = new TrianguloPerimetroService();
     cal.put(lado, base);
     double perimetros = cal.get();
        System.out.println("perimetro es :"+perimetros);
    }
}
