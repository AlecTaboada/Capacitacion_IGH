/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.pruebas;
import solid.dto.CalculoDto;
import solid.services.RectanguloServices;

/**
 *
 * @author PC
 */
public class Prueba01 {
    public static void main(String[] args) {
        double alto;
        double base;
     CalculoDto dto = new CalculoDto();
     dto.setAlto(6);
     dto.setBase(8);
     alto=dto.getAlto();
     base=dto.getBase();
     
     RectanguloServices cal = new RectanguloServices();
     cal.put(alto, base);
     double areas = cal.get();
        System.out.println("area es :"+areas);
    }
    
    
}
