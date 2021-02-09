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
public class problema7 {
    public static void main(String[] args) {
                 //Variables
		double importe,cantidadP=0,precio;

		//Lectura de datos
                Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de productos comprados: ");
		cantidadP = sc.nextDouble();
                System.out.println("Ingrese el precio del producto comprado: ");
		precio = sc.nextDouble();

		//Proceso
                
		if (cantidadP >=12 && cantidadP<24){ 
			precio=  precio*95/100;
                }
		if (cantidadP >=24 && cantidadP<36){ 
			precio=  precio*90/100;
                }
		if (cantidadP >=36) {
			precio=  precio*85/100;
                }        
                importe = precio*cantidadP;
                
		//Reporte
		System.out.println("El importe de la venta es: "+  importe);
	}
}
