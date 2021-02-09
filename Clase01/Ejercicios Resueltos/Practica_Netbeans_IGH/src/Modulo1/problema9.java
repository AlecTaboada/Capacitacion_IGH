/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo1;
import java.util.Scanner;
/**
 *
 * @author dondo
 */
public class problema9 {
     public static void main(String[] args) {
        //VARIABLES
        int velocidad,distancia,tiempo;
        
        //LECTURA DE DATOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la velocidad del coche:");
        velocidad=sc.nextInt();
        
        System.out.println("Ingrese la distancia a recorrer:");
        distancia=sc.nextInt();
        //PROCESO
        tiempo= distancia / velocidad;
        
         //SALIDA DE DATOS
        System.out.println("El importe que haria la promoción es: "+tiempo);
    }
}
