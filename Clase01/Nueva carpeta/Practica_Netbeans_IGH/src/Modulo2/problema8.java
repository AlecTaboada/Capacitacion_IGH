/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

import java.util.Scanner;

/**
 *
 * @author dondo
 */
public class problema8 {
     public static void main(String[] args) {
                 //Variables
		double importe,peso,distancia,precio=0;

		//Lectura de datos
                Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el peso del reparto: ");
		peso = sc.nextDouble();
                System.out.println("Ingrese la distancia que recorrera el delivery: ");
		distancia = sc.nextDouble();

		//Proceso
                
		if (peso >= 1 && peso<5){
			precio  =  8;
                }
                
		if (peso >=5 && peso<10){ 
			precio=  6;
                }
		if (peso >=10) {
			precio=  4;
                }
                importe = precio * distancia;
                
		//Reporte
		System.out.println("El importe de la venta es: "+  importe);
	}
}
