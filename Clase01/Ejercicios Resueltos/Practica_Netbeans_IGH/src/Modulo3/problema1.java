/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo3;
import java.util.Scanner;
/**
 *
 * @author dondo
 */
public class problema1 {
    public static void main(String[] args) {
        //VARIABLES
        int n,i,sumapar=0,sumaimpar=0;
        
        //LECTURA DE DATOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        n=sc.nextInt();
        //PROCESO
        
         for ( i=1;i<n+1;i++){
        if (i%2==0){
            sumapar=sumapar+i;
        }
        else{
            sumaimpar=sumaimpar+i;
        }
        }
         //SALIDA DE DATOS
        System.out.println("La suma de numeros pares es:"+sumapar);
        System.out.println("La suma de numeros impares es:"+sumaimpar);
    }
    
}
