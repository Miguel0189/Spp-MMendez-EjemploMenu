/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.miguel.ejemplomenu;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SppMiguelEjemplomenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opEntrada;
        //Desplegamos el menu
        Scanner kb= new Scanner (System.in);
        System.out.println("Calculadora de areas, perimetros y volumenes");
        System.out.println("Introduce la opcion deseada");
        System.out.println("1.Calcular area");
        System.out.println("2.Calcular perimetro");
        System.out.println("3.Calcular volumen");
        System.out.println("4.Salir");
        opEntrada=kb.nextInt();
        
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al calculo de area");
            case 2: 
                System.out.println("Bienvenido al calculo de perimetro");
            case 3: System.out.println("Bienvenido al calculo de volumenes");
            break;
            default:
                System.out.println("Adios");
        }
            }
    
}
