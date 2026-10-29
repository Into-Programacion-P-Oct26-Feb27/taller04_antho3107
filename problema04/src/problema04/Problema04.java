/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author SALASC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //Declaracion de variables
        String nombre;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double costobase;
        double costoadicional;
        double costofinal;
        
        System.out.println("Ingrese su nombre y apellido:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el valor del CPU:");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el valor del teclado:");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el valor del raton:");
        raton = entrada.nextDouble();
        System.out.println("Ingrese el valor de la pantalla:");
        pantalla = entrada.nextDouble();
        
        costobase = cpu + teclado + raton + pantalla;
        
        costoadicional = costobase * 0.15;
        
        costofinal = costobase + costoadicional;
        
        
        System.out.printf("REPORTE\nNombre del cliente: %s\n"
            + "Valores Iniciales\nCPU: $%.2f\nTeclado: $%.2f\n"
            + "Raton: $%.2f\nPantalla: $%.2f\n----------------\n"
            + "Costo base: $%.2f\nCosto adicional del 15%%: $%.2f\n"
            + "Costo final: $%.2f\n",
            nombre,
            cpu,
            teclado,
            raton,
            pantalla,
            costobase,
            costoadicional,
            costofinal);
    }
}
