/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //Declaracion de variables
        String nombre;
        String direccion;
        double costo;
        double minutos;
        double pagar;
        
        System.out.println("Ingrese su nombre y apellido:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su direccion:");
        direccion = entrada.nextLine();
        System.out.println("Costo por minutos:");
        costo = entrada.nextDouble();
        System.out.println("Minutos consumidos:");
        minutos = entrada.nextDouble();
        
        pagar = costo * minutos;
        
        System.out.printf("-------------------\n"
                + "PLANILLA DE SERVICIO ELECTRICO\n-------------------\n"
                + "nTitular: %s\nDireccion: %s\n"
                + "-------------------\nCosto por minuto: $%.2f\n"
                + "Minutos consumidos: %.2fmin\n-------------------\n"
                + "VALOR TOTAL A PAGAR: $%.2f\n-------------------\n",
                nombre,
                direccion,
                costo,
                minutos,
                pagar);
        
       
        
    }
    
}
