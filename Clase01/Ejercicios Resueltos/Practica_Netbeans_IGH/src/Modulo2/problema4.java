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
public class problema4 {
     public static void main(String[] args) {
        //Variables
		double puntaje;
		String sitEstu = "No ingresó";
		
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese el puntaje obtenido: ");
		puntaje = sc.nextDouble();

		//Proceso
		if (puntaje >= 80) 
			sitEstu = "Ingresó a Sistemas";
		if (puntaje >= 70) 
			sitEstu = "Ingresó a Electrónica";
		if (puntaje >= 60) 
			sitEstu = "Ingresó a Industrial";
		if (puntaje >= 50) 
			sitEstu = "Ingresó a Mecánica";
		
		//Reporte
		System.out.println("\nSITUACIÓN DEL POSTULANTE:");
		System.out.println("=============================");
		System.out.println("Resultado:    " + sitEstu);
		

	}
}

