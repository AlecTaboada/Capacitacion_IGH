/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.dto;

/**
 *
 * @author PC
 */
public class CalculoDto {
    private double area,perimetro;
    private double base,alto,lado,radio;
    public CalculoDto(){
    
}

    public CalculoDto(double area, double perimetro, double base, double alto, double lado, double radio) {
        this.area = area;
        this.perimetro = perimetro;
        this.base = base;
        this.alto = alto;
        this.lado = lado;
        this.radio = radio;
    }
   public double getArea(){
       return area;
   }
   public void setArea(double area){
       this.area=area;
   }
   public double getPerimetro(){
       return perimetro;
   }
   public void setPerimetro(double perimetro){
       this.perimetro=perimetro;
       
   }
   public double getBase(){
       return base;
   }
   public void setBase(double base){
       this.base=base;
   }
    public double getAlto(){
       return alto;
   }
   public void setAlto(double alto){
       this.alto=alto;
   }
    public double getLado(){
       return lado;
   }
   public void setLado(double lado){
       this.lado=lado;
   }
    public double getRadio(){
       return radio;
   }
   public void setRadio(double radio){
       this.radio=radio;
   }
   
   
}
