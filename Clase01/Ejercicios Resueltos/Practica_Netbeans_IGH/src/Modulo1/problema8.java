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
public class problema8 {
     public static void main(String[] args) {
        //VARIABLES
        int nroe,costo,importe;
        
        //LECTURA DE DATOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de estudiantes:");
        nroe=sc.nextInt();
        
        System.out.println("Ingrese el costo por persona:");
        costo=sc.nextInt();
        //PROCESO
        importe= nroe * costo;
        
         //SALIDA DE DATOS
        System.out.println("El importe que haria la promoción es: "+importe);
    }
}
