/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Mercy
 */
public class problema6 {
    public static void main(String[] args) {
    // Variables
        int notas [];
        double promedio;
        String estado = "Desaprobado";
        Scanner sc = new Scanner(System.in);
        
        // Lectura
        notas = new int[4];
        System.out.println ("Ingrese las 4 notas del estudiante: ");
        for (int i = 0; i < 4; i++){
            System.out.print("Nota " + (i+1) + ": ");
            notas[i] = sc.nextInt();
        }
        
        // Proceso
        Arrays.sort(notas); // Ordenando notas de forma Ascendente
        
        promedio = 0;
        for (int i = 3; i >=1; i--){
            promedio += notas[i];
        }
        
        promedio /=3;
        if (promedio>=14){
        estado="Aprobado";
    }
    
        //Reporte
        System.out.println("\n******************************************");
        System.out.print("El promedio de las tres mejores notas es: " + promedio);
        System.out.print("\nEl estado del alumno es: " + estado);
        System.out.print("\n");
    }
}

