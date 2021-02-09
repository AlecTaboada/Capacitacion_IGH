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
public class problema4 {
    public static void main(String[] args) {
        //VARIABLES
        int n1,n2,n3;
        float media;
        //LECTURA DE DATOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        n1=sc.nextInt();
        
        System.out.println("Ingrese el numero 2:");
        n2=sc.nextInt();
        
        System.out.println("Ingrese el numero 3:");
        n3=sc.nextInt();
        //PROCESO
        media= (n1 + n2 + n3)/3;
        
         //SALIDA DE DATOS
          System.out.println("El promedio aritmetico de los números ingresados es:"+media);
        System.out.println("El promedio aritmetico de los números ingresados es:"+media);
    }
}
